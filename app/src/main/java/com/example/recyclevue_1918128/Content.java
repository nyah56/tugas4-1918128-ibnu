package com.example.recyclevue_1918128;

public class Content {
    private String nama,msg,clock;
    private int img;
    public Content(String nama, String msg, String clock,int img){
        this.nama = nama;
        this.msg = msg;
        this.clock = clock;
        this.img=img;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getMsg(){
        return msg;
    }
    public void setNim(String msg){
        this.msg = msg;
    }
    public String getClock(){
        return clock;
    }
    public void setClock(String clock){
        this.clock = clock;
    }
    public void setImg(){
        this.img=img;
    }
    public int getImg(){
        return img;
    }
}
