package com.foolcage.foolcompute.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuanqi on 17-5-25.
 */
@Getter
@Setter
@NoArgsConstructor
public class Stock implements Serializable {
    private String type;
    private String id;
    private String code;
    private String name;
    private Date listDate;
    private Date delistDate;
    private String exchange;
}
