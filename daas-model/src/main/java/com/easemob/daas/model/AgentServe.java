package com.easemob.daas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgentServe {

    private String id;
    private String agentId;
    private String createTime;
    private String stateTime;
    private String tenantId;
    private String organId;
    private String state;
    private String fromType;
}
