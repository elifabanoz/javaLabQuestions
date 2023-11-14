package part1;

import java.util.LinkedList;

public class ListOfEmails {
    private LinkedList<Email> emails = new LinkedList<>();

    public void add(Email email) {
        emails.add(email);
    }

    public Email read(int id) {
        for (Email email : emails) {
            if (email.getId() == id) {
                return email;
            }
        }
        return null;
    }

    public Email delete(int id) {
        for (Email email : emails) {
            if (email.getId() == id) {
                emails.remove(email);
                return email;
            }
        }
        return null;
    }

    public void showAll(boolean flag) {
        for (Email email : emails) {
            if (flag || !email.isRead()) {
                System.out.printf("Email id: %d, Subject: %s, Message: %s, Time: %d, Read: %s\n",
                        email.getId(),
                        email.getSubject().substring(0, Math.min(email.getSubject().length(), 25)),
                        email.getMessage().substring(0, Math.min(email.getMessage().length(), 40)),
                        email.getTime(),
                        email.isRead() ? "Yes" : "No");
            }
        }
    }

    public LinkedList<Email> getEmails() {
        return emails;
    }
}

