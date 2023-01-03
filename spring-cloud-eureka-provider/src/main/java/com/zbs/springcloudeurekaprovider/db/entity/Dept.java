package com.zbs.springcloudeurekaprovider.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 * @author
 * @since 2022-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "deptno", type = IdType.AUTO)
    private Long deptno;

    private String dname;

    private String dbSource;

    @Override
    protected Serializable pkVal() {
        return this.deptno;
    }

}
