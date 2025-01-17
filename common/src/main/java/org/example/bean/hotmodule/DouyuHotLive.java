package org.example.bean.hotmodule;

import org.example.bean.HotLive;

/**
 * @author Genius
 * @date 2023/07/19 01:16
 **/
public class DouyuHotLive extends HotLive {

    private String liveModule;  //直播板块

    private String url;         //直播间地址

    private String roomCoverPic;     //直播间封面地址


    private int type;

    private int uid;

    private int moduleId; //直播板块Id

    public DouyuHotLive(int watcherNum, int liveId, String liveName, String liver, String description,
                        String liveModule, String url, String roomCoverPic, int type, int uid,int moduleId) {
        super(watcherNum, liveId, liveName, liver, description);
        this.liveModule = liveModule;
        this.url = url;
        this.roomCoverPic = roomCoverPic;
        this.type = type;
        this.uid = uid;
        this.moduleId = moduleId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getLiveModule() {
        return liveModule;
    }

    public void setLiveModule(String liveModule) {
        this.liveModule = liveModule;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoomCoverPic() {
        return roomCoverPic;
    }

    public void setRoomCoverPic(String roomCoverPic) {
        this.roomCoverPic = roomCoverPic;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
