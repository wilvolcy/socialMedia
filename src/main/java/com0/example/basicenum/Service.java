package com0.example.basicenum;

public enum Service {
    TEST("Code_001","You get the code 001");
    private final String code;
    private final String msg;
     Service(String code, String msg){
        this.code =  code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
