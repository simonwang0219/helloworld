package com.dhu.wlq.service.local;

import lombok.Data;

/**
 * 使用 ThreadLocal 改造后的代码，不再需要在各个方法间传递 Session 对象，并且也非常轻松的保证了每个线程拥有自己独立的实例。
 */

public class SessionHandler1 {

    public static ThreadLocal<Session> session = new ThreadLocal<Session>();

    @Data
    public static class Session {
        private String id;
        private String user;
        private String status;
    }

    public void createSession() {
        session.set(new Session());
    }

    public String getUser() {
        return session.get().getUser();
    }

    public String getStatus() {
        return session.get().getStatus();
    }

    public void setStatus(String status) {
        session.get().setStatus(status);
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                SessionHandler1 handler1 = new SessionHandler1();
                handler1.getStatus();
                handler1.getUser();
                handler1.setStatus("close");
                handler1.getStatus();
            }
        }).start();
    }
}
