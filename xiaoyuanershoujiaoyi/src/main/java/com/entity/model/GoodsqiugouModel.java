package com.entity.model;

import com.entity.GoodsqiugouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品求购
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsqiugouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 商品名称
     */
    private String goodsqiugouName;


    /**
     * 商品图片
     */
    private String goodsqiugouPhoto;


    /**
     * 商品类型
     */
    private Integer goodsTypes;


    /**
     * 求购数量
     */
    private Integer goodsqiugou;


    /**
     * 商品求购状态
     */
    private Integer goodsqiugouTypes;


    /**
     * 商品详情
     */
    private String goodsqiugouContent;


    /**
     * 创建时间show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：商品名称
	 */
    public String getGoodsqiugouName() {
        return goodsqiugouName;
    }


    /**
	 * 设置：商品名称
	 */
    public void setGoodsqiugouName(String goodsqiugouName) {
        this.goodsqiugouName = goodsqiugouName;
    }
    /**
	 * 获取：商品图片
	 */
    public String getGoodsqiugouPhoto() {
        return goodsqiugouPhoto;
    }


    /**
	 * 设置：商品图片
	 */
    public void setGoodsqiugouPhoto(String goodsqiugouPhoto) {
        this.goodsqiugouPhoto = goodsqiugouPhoto;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 获取：求购数量
	 */
    public Integer getGoodsqiugou() {
        return goodsqiugou;
    }


    /**
	 * 设置：求购数量
	 */
    public void setGoodsqiugou(Integer goodsqiugou) {
        this.goodsqiugou = goodsqiugou;
    }
    /**
	 * 获取：商品求购状态
	 */
    public Integer getGoodsqiugouTypes() {
        return goodsqiugouTypes;
    }


    /**
	 * 设置：商品求购状态
	 */
    public void setGoodsqiugouTypes(Integer goodsqiugouTypes) {
        this.goodsqiugouTypes = goodsqiugouTypes;
    }
    /**
	 * 获取：商品详情
	 */
    public String getGoodsqiugouContent() {
        return goodsqiugouContent;
    }


    /**
	 * 设置：商品详情
	 */
    public void setGoodsqiugouContent(String goodsqiugouContent) {
        this.goodsqiugouContent = goodsqiugouContent;
    }
    /**
	 * 获取：创建时间show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
