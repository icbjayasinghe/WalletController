package com.isuruj.walletcontroller;

public class DailyExpences {
    private String time;
    private String reason;
    private String amount;

    public DailyExpences(String time, String reason, String amount) {
        this.time = time;
        this.reason = reason;
        this.amount = amount;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public String getAmount() {
        return amount;
    }
}
