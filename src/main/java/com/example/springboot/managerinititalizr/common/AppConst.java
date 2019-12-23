package com.example.springboot.managerinititalizr.common;

public class AppConst {




    public final static long SECOND = 1000  ;
    public final static long MINUS = SECOND * 60;
    public final static long HOUR = MINUS * 60;
    public final static long DAY = HOUR * 24;

    /***
     * 登陆session key
     */
    public final static String USER_LOGIN_SESSION = "user_login_session_key";




    /***
     * 文件下载内容类型
     *
     */
    public final static String RSP_IMG_CONTENT_TYPE = "image/{0}";

    /***
     * 文件下载内容类型
     *
     */
    public final static String RSP_DOWNLOAD_CONTENT_TYPE = "application/x-download";

    /***
     * 文件下载类型头1
     *
     */
    public final static String RSP_DOWNLOAD_HEADER_1 = "Content-Disposition";

    /***
     * 文件下载类型头2
     * attachment;fileName={0} -->添加文件名 与RSP_DOWNLOAD_HEADER_1组成响应头
     *
     */
    public final static String RSP_DOWNLOAD_HEADER_2 = "attachment;fileName=";

    /***
     * 普通表单请求头
     */
    public final static String REQ_CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded";
    /***
     * 上传文件请求头
     */
    public final static String REQ_CONTENT_TYPE_FILE = "multipart/form-data";
    /***
     * json 请求头
     */
    public final static String REQ_CONTENT_TYPE_JSON = "application/json";

    public static final String REQ_CONTENT_TYPE_PNG = "image/png";

    /***
     * 匹配 图片 类型 正则
     */
    public final static String APP_IMG_MATCH_REG = "jpg|png|gif|bmp|jpeg";

    //默认编码 utf-8
    public static final String UTF8 = "UTF-8";

    //操作时间 单位
    public static final String MS = "ms";
    //json 前端返回日期格式化模式
    public static final String JSON_DATE_TIME_PATTEN = "yyyy-MM-dd HH:mm:ss";
    //时区
    public static final String TIMEZONE = "GMT+8";
    public static final String NULL_STR = "null";
    public static final String EMPTY_STR = "";


    public static final String MESSAGE = "msg";

    public static final String QR_IMG_TYPE = "png";

    public static final String TRUE = "1";
    public static final String FALSE = "0";


    public static final String SHELL_ADD_SUCCESS_STR = "添加成功";
    public static final String ADMIN_ROLE = "1";
    public static final Long MENU_DEFAULT_UPID = -1L;




}