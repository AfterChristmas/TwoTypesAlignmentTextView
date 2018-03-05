# TwoTypesAlignmentTextView
 One TextView with  Two  types of Alignment 一个Textview根据行数不同实现不同的对齐方式
 
# 使用方法

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_below="@+id/store_order_item_ll_order_stream"
    android:clickable="true"
    android:orientation="horizontal"
    android:paddingBottom="12dp"
    android:paddingTop="6dp">

    <TextView
        android:id="@+id/info_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16dp"
        android:text="商品说明："
        android:textColor="@color/shallow_black"
        android:textSize="13sp" />

    <TwoTypesAlignmentTextView
        android:id="@+id/info_detail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="16dp"
        android:layout_toRightOf="@+id/info_title"
        android:text="此商品非实体此商品非实体此商品非实体此商品非实体此商品非实体"
        android:textColor="@color/person_copyright_color"
        android:textSize="13sp" />

</RelativeLayout>


# 效果图

![效果示例](https://github.com/AfterChristmas/TwoTypesAlignmentTextView/blob/master/example1.png?raw=true)


