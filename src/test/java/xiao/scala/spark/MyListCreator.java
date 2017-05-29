package xiao.scala.spark;

import java.util.List;

/**
 * 创建list的接口
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/5/29 23:00
 */

@FunctionalInterface
public interface MyListCreator<T extends List<?>> {

    T create();
}
