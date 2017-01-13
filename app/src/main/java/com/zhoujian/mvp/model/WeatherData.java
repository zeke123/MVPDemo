package com.zhoujian.mvp.model;

/**
 * Created by zhoujian on 2016/12/28.
 */

public class WeatherData
{

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean
    {

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean
        {


            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            @Override
            public String toString() {
                return "SkBean{" +
                        "humidity='" + humidity + '\'' +
                        ", temp='" + temp + '\'' +
                        ", wind_direction='" + wind_direction + '\'' +
                        ", wind_strength='" + wind_strength + '\'' +
                        ", time='" + time + '\'' +
                        '}';
            }
        }

        public static class TodayBean
        {


            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                @Override
                public String toString() {
                    return "WeatherIdBean{" +
                            "fa='" + fa + '\'' +
                            ", fb='" + fb + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "TodayBean{" +
                        "city='" + city + '\'' +
                        ", temperature='" + temperature + '\'' +
                        ", weather='" + weather + '\'' +
                        ", weather_id=" + weather_id +
                        ", wind='" + wind + '\'' +
                        ", week='" + week + '\'' +
                        ", date_y='" + date_y + '\'' +
                        ", dressing_index='" + dressing_index + '\'' +
                        ", dressing_advice='" + dressing_advice + '\'' +
                        ", uv_index='" + uv_index + '\'' +
                        ", comfort_index='" + comfort_index + '\'' +
                        ", wash_index='" + wash_index + '\'' +
                        ", travel_index='" + travel_index + '\'' +
                        ", exercise_index='" + exercise_index + '\'' +
                        ", drying_index='" + drying_index + '\'' +
                        '}';
            }
        }

        public static class FutureBean {


            private Day20161228Bean day_20161228;
            private Day20161229Bean day_20161229;
            private Day20161230Bean day_20161230;
            private Day20161231Bean day_20161231;
            private Day20170101Bean day_20170101;
            private Day20170102Bean day_20170102;
            private Day20170103Bean day_20170103;

            public Day20161228Bean getDay_20161228() {
                return day_20161228;
            }

            public void setDay_20161228(Day20161228Bean day_20161228) {
                this.day_20161228 = day_20161228;
            }

            public Day20161229Bean getDay_20161229() {
                return day_20161229;
            }

            public void setDay_20161229(Day20161229Bean day_20161229) {
                this.day_20161229 = day_20161229;
            }

            public Day20161230Bean getDay_20161230() {
                return day_20161230;
            }

            public void setDay_20161230(Day20161230Bean day_20161230) {
                this.day_20161230 = day_20161230;
            }

            public Day20161231Bean getDay_20161231() {
                return day_20161231;
            }

            public void setDay_20161231(Day20161231Bean day_20161231) {
                this.day_20161231 = day_20161231;
            }

            public Day20170101Bean getDay_20170101() {
                return day_20170101;
            }

            public void setDay_20170101(Day20170101Bean day_20170101) {
                this.day_20170101 = day_20170101;
            }

            public Day20170102Bean getDay_20170102() {
                return day_20170102;
            }

            public void setDay_20170102(Day20170102Bean day_20170102) {
                this.day_20170102 = day_20170102;
            }

            public Day20170103Bean getDay_20170103() {
                return day_20170103;
            }

            public void setDay_20170103(Day20170103Bean day_20170103) {
                this.day_20170103 = day_20170103;
            }

            public static class Day20161228Bean {


                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {


                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    @Override
                    public String toString() {
                        return "WeatherIdBeanX{" +
                                "fa='" + fa + '\'' +
                                ", fb='" + fb + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Day20161228Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }


            }

            public static class Day20161229Bean {


                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {


                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    @Override
                    public String toString() {
                        return "WeatherIdBeanXX{" +
                                "fa='" + fa + '\'' +
                                ", fb='" + fb + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Day20161229Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }
            }

            public static class Day20161230Bean {


                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {


                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    @Override
                    public String toString() {
                        return "WeatherIdBeanXXX{" +
                                "fa='" + fa + '\'' +
                                ", fb='" + fb + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Day20161230Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }
            }

            public static class Day20161231Bean {


                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {


                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    @Override
                    public String toString() {
                        return "WeatherIdBeanXXXX{" +
                                "fa='" + fa + '\'' +
                                ", fb='" + fb + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Day20161231Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }
            }

            public static class Day20170101Bean
            {



                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {


                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }

                @Override
                public String toString() {
                    return "Day20170101Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }
            }

            public static class Day20170102Bean
            {


                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }

                @Override
                public String toString() {
                    return "Day20170102Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }
            }

            public static class Day20170103Bean {


                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    @Override
                    public String toString() {
                        return "WeatherIdBeanXXXXXXX{" +
                                "fa='" + fa + '\'' +
                                ", fb='" + fb + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Day20170103Bean{" +
                            "date='" + date + '\'' +
                            ", temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "FutureBean{" +
                        "day_20161228=" + day_20161228 +
                        ", day_20161229=" + day_20161229 +
                        ", day_20161230=" + day_20161230 +
                        ", day_20161231=" + day_20161231 +
                        ", day_20170101=" + day_20170101 +
                        ", day_20170102=" + day_20170102 +
                        ", day_20170103=" + day_20170103 +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "future=" + future +
                    ", sk=" + sk +
                    ", today=" + today +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "error_code=" + error_code +
                ", resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}
