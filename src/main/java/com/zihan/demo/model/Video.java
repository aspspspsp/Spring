package com.zihan.demo.model;

import com.zihan.demo.constant.VideoCategoryEnum;
import lombok.Data;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Data
public class Video {
    private final long id;
    private final VideoCategoryEnum category;
}
