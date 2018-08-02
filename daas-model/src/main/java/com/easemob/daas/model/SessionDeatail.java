package com.easemob.daas.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionDeatail {

    private String  id;
    private String  organId;
    private String  tenantId;
    private String  groupId;
    private String  stepId;
    private String  sessionId;
    private String  visitorId;
    private String agentId;
    private String agentType;
    private String sessionType;
    private String originType;
    private String channelType;
    private String channelId;
    private String createTime;
    private String startTime;
    private String stopTime;
    private String waitTime;
    private String workTime;
    private String vmsgCount;
    private String amsgCount;
    private String smsgCount;
    private String msgCount;
    private String firstResTime;
    private String avgResTime;
    private String visitorMark;
    private String qmarkLevel;
    private String qualityMark;
    private String qmActorId;
    private String first;
    private String transIn;
    private String transOut;
    private String last;
    private String dIndex;
    private String indexTransOut;
    private String indexTransIn;
    private String gIndex;
    private String effective;
    private String sessionTag;
    private String satisfactionTag;
    private String visitorTag;










}
