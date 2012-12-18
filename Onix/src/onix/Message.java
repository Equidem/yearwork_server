package onix;

import java.util.Date;

/**
 * Le já ~^_^~
 *  Muffin
 * 
 * Tato třída reprezentuje zprávu od klienta.
 */

public class Message {
    String header;
    String email;
    String password;
    int id;
    String nickname;
    String status;
    byte error;
    String sender;
    String receiver;
    Date dateTime;
    String content;

    public Message(String header, String email, String password, int id, String nickname, /* konstruktor zpávy */
            String status, byte error, String sender, String receiver, Date dateTime, String content) {
        this.header = header;
        this.email = email;
        this.password = password;
        this.id = id;
        this.nickname = nickname;
        this.status = status;
        this.error = error;
        this.sender = sender;
        this.receiver = receiver;
        this.dateTime = dateTime;
        this.content = content;
    }
    
    
}
