package com.dhu.wlq.service.local;

import lombok.Data;

/**
 * 对于 Java Web 应用而言，Session 保存了很多信息。很多时候需要通过 Session 获取信息，有些时候又需要修改 Session 的信息。
 * 一方面，需要保证每个线程有自己单独的 Session 实例。另一方面，由于很多地方都需要操作 Session，存在多方法共享 Session 的需求。
 * 如果不使用 ThreadLocal，可以在每个线程内构建一个 Session实例，并将该实例在多个方法间传递，如下所示。
 *
 * 该方法是可以实现需求的。但是每个需要使用 Session 的地方，都需要显式传递 Session 对象，方法间耦合度较高。
 */

public class SessionHandler {

    @Data
    public static class Session {
        private String id;
        private String user;
        private String status;
    }

    public Session createSession() {
        return new Session();
    }

    public String getUser(Session session) {
        return session.getUser();
    }

    public String getStatus(Session session) {
        return session.getStatus();
    }

    public void setStatus(Session session, String status) {
        session.setStatus(status);
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                SessionHandler handler = new SessionHandler();
                Session session = handler.createSession();
                handler.getStatus(session);
                handler.getUser(session);
                handler.setStatus(session, "close");
                handler.getStatus(session);
            }
        }).start();
    }
}
