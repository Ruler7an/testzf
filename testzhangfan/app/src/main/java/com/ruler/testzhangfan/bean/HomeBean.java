package com.ruler.testzhangfan.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:30
 * year:2019
 * project_name:testzhangfan
 */
@Entity
public class HomeBean {
    @Id(autoincrement = true)
    private Long id;
    private String title;
    private String content;
    private int img;
    private String url;
    @Generated(hash = 1476489867)
    public HomeBean(Long id, String title, String content, int img, String url) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.img = img;
        this.url = url;
    }
    @Generated(hash = 931577662)
    public HomeBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getImg() {
        return this.img;
    }
    public void setImg(int img) {
        this.img = img;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
