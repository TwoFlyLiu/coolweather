package com.coolweather.android.gson;

/**
 * Created by TwoFlyLiu on 2019/7/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
