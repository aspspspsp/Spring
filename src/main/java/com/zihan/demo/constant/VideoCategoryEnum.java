package com.zihan.demo.constant;

import lombok.Getter;

/**
 * 影片類型的枚舉
 * Created by zihanxu on 2017/9/20.
 */
@Getter
public enum VideoCategoryEnum {
    EVALUATION(1, "評測"),
    TUTORIAL(2, "教學"),
    VLOG(3, "影音部落"),
    GAMING(4, "遊戲"),
    FUNNY(5, "搞笑");

    private int id;
    private String desc;

    VideoCategoryEnum(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
