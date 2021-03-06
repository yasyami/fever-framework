package com.github.fanfever.fever.mail.hook.event;

/**
 * hook 事件
 * @author scott.he
 * @date 2017/4/18
 */
public enum HookEvent {
  /**
   * 请求
   */
  REQUEST("请求", "request", "邮件请求成功"),
  /**
   * 发送
   */
  DELIVER("发送", "deliver", "邮件发送成功"),
  /**
   * 打开
   */
  OPEN("打开", "open", "用户打开邮件"),
  /**
   * 点击
   */
  CLICK("点击", "click", "用户点击链接"),
  /**
   * 取消订阅
   */
  UNSUBSCRIBE("取消订阅", "unsubscribe", "用户取消订阅邮件"),
  /**
   * 举报
   */
  REPORT_SPAM("举报", "report_spam", "用户举报邮件"),
  /**
   * 无效邮件
   */
  INVALID("无效邮件", "invalid", "邮件未发送成功"),
  /**
   * 退信
   */
  BOUNCE("退信", "bounce", "接收方永久性拒收该邮件"),
  /**
   * 软退信
   */
  SOFT_BOUNCE("软退信", "soft_bounce", "接收方临时性拒收该邮件"),
  /**
   * 转信
   */
  ROUTE("转信", "route", "转信/收信路由"),
  /**
   * 下载附件
   */
  DOWNLOAD("下载附件", "download", "用户下载附件"),
  /**
   * 回复邮件
   */
  REPLY("回信", "reply", "用户回复邮件");

  private String name;
  private String code;
  private String triggerCondition;
  HookEvent(String name, String code, String triggerCondition) {
    this.name = name;
    this.code = code;
    this.triggerCondition = triggerCondition;
  }
  public String getName() {return this.name;}
  public String getCode() {return this.code;}
  public String getTriggerCondition() {return this.triggerCondition;}
}
