package com.zihan.demo.controllers;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.zihan.demo.response.Resp;
import com.zihan.demo.services.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zihanxu on 2017/9/14.
 */
@RestController
@RequestMapping("video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    Logger logger = LoggerFactory.getLogger(VideoController.class);

    @RequestMapping("addVideo")
    public Resp addVideo() {
        return null;
    }

    @RequestMapping("getVideo")
    public Resp getVideo(@RequestParam long videoId) {
        return videoService.getVideo(videoId);
    }

    @RequestMapping("modifyVideo")
    public Resp modifyVideo() {
        return null;
    }
}
