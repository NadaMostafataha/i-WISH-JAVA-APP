/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;
//server classs

/**
 *
 * @author dell
 */
import DATABASE.DAO;
import MODEL.User;
import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

public class Server {

    ServerSocket serverSocket;
    

    public Server() {
        try {
            serverSocket = new ServerSocket(5005);
            while (true) {
                Socket s = serverSocket.accept();
                new Handler(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new Server();
    }

}

class Handler extends Thread {

    DataInputStream dis;
    PrintStream ps;
    static Vector<Handler> clientsVector = new Vector<Handler>();
    Socket ss;

    public Handler(Socket cs) {
        ss=cs;
        try {
            dis = new DataInputStream(cs.getInputStream());
            ps = new PrintStream(cs.getOutputStream());
            Handler.clientsVector.add(this);
            start();
        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        while (true) {
            try {
                String str1 = dis.readLine();
                
                JSONObject message = new JSONObject(str1);
                if (message.getString("KEY").equals("LOGIN")){
                JSONObject info = new JSONObject(message.getJSONObject("USER").toString());
                Gson gson = new Gson();
                User user = gson.fromJson(info.toString(),User.class);
                if(DAO.checkLogin(user)){
                    JSONObject confirm = null;
                    confirm = new JSONObject();
                    confirm.put("KEY","LOGIN");
                    confirm.put("CONFIRM","TRUE");
                    ps.println(confirm.toString());
                    
                }
                else {
                    System.out.println("Login Failed");
                    JSONObject confirm = new JSONObject();
                    confirm.put("KEY","LOGIN");
                    confirm.put("CONFIRM","false");
                    ps.println(confirm.toString());
                }}
                else if (message.getString("KEY").equals("REG")){
                        JSONObject info = new JSONObject(message.getString("USER"));
                        Gson gson = new Gson();
                        User user = gson.fromJson(info.toString(),User.class);
                        DAO.insertUser(user);
                        }
                }
            catch(SocketException se){
                try {
                    ss.close();
                    dis.close();
                    clientsVector.remove(this);
                    
                } catch (IOException ex) {
                    Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }catch (IOException ex) {
                Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

    /*void sendMessageToAll(String msg) {
        for (Handler ch : clientsVector) {
            ch.ps.println(msg);
        }
    }*/
}