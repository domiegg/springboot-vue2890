package com.entity.vo;

import com.entity.GoodsqiugouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品求购
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goodsqiugou")
public class GoodsqiugouVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 商品名称
     */

    @TableField(value = "goodsqiugou_name")
    private String goodsqiugouName;


    /**
     * 商品图片
     */

    @TableField(value = "goodsqiugou_photo")
    private String goodsqiugouPhoto;


    /**
     * 商品类型
     */

    @TableField(value = "goods_types")
    private Integer goodsTypes;


    /**
     * 求购数量
     */

    @TableField(value = "goodsqiugou_")
    private Integer goodsqiugou;


    /**
     * 商品求购状态
     */

    @TableField(value = "goodsqiugou_types")
    private Integer goodsqiugouTypes;


    /**
     * 商品详情
     */

    @TableField(value = "goodsqiugou_content")
    private String goodsqiugouContent;


    /**
     * 创建时间show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：商品名称
	 */
    public String getGoodsqiugouName() {
        return goodsqiugouName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setGoodsqiugouName(String goodsqiugouName) {
        this.goodsqiugouName = goodsqiugouName;
    }
    /**
	 * 设置：商品图片
	 */
    public String getGoodsqiugouPhoto() {
        return goodsqiugouPhoto;
    }


    /**
	 * 获取：商品图片
	 */

    public void setGoodsqiugouPhoto(String goodsqiugouPhoto) {
        this.goodsqiugouPhoto = goodsqiugouPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 设置：求购数量
	 */
    public Integer getGoodsqiugou() {
        return goodsqiugou;
    }


    /**
	 * 获取：求购数量
	 */

    public void setGoodsqiugou(Integer goodsqiugou) {
        this.goodsqiugou = goodsqiugou;
    }
    /**
	 * 设置：商品求购状态
	 */
    public Integer getGoodsqiugouTypes() {
        return goodsqiugouTypes;
    }


    /**
	 * 获取：商品求购状态
	 */

    public void setGoodsqiugouTypes(Integer goodsqiugouTypes) {
        this.goodsqiugouTypes = goodsqiugouTypes;
    }
    /**
	 * 设置：商品详情
	 */
    public String getGoodsqiugouContent() {
        return goodsqiugouContent;
    }


    /**
	 * 获取：商品详情
	 */

    public void setGoodsqiugouContent(String goodsqiugouContent) {
        this.goodsqiugouContent = goodsqiugouContent;
    }
    /**
	 * 设置：创建时间show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
