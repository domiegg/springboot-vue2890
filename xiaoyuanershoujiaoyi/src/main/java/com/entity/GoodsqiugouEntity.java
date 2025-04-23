package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品求购
 *
 * @author 
 * @email
 */
@TableName("goodsqiugou")
public class GoodsqiugouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsqiugouEntity() {

	}

	public GoodsqiugouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Goodsqiugou{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", goodsqiugouName=" + goodsqiugouName +
            ", goodsqiugouPhoto=" + goodsqiugouPhoto +
            ", goodsTypes=" + goodsTypes +
            ", goodsqiugou=" + goodsqiugou +
            ", goodsqiugouTypes=" + goodsqiugouTypes +
            ", goodsqiugouContent=" + goodsqiugouContent +
            ", createTime=" + createTime +
        "}";
    }
}
