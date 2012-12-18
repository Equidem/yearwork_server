package onix;

import com.google.gson.*;
import java.util.Date;

/**
 * Le já ~^_^~ Muffin Třída pro zpracování zpráv od klientů.
 */
public class MessageModul {

    static Gson GS;
    
    public MessageModul(Gson GS) {
        this.GS = GS;
    }

    public static void main(String[] args, String m) {
        Message mes = pcsMss(m);
        sendMss(mes);
        
    }

    public static Message pcsMss(String m) { //process message - uložení zprávy do objektu.
        Message mes;
        String header = GS.fromJson(m, null);
        String email = "";
        String password = "";
        int id = 0;
        String nickname = "";
        String status = "";
        byte error = 0;
        String sender = "";
        String receiver = "";
        Date dateTime = new Date(9999, 12, 31, 23, 59, 59);
        String content = "";
        mes = new Message(header, email, password, id, nickname, status, error, sender, receiver, dateTime, content);
        if(id != 0) {
            System.out.println("problem s id.");
        }
        return mes;
    }

    public static void sendMss(Message mes) { //send message - odeslani pravy do web modulu nebo socket modulu
    }
}