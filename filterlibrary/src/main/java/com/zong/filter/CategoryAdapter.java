package com.zong.filter;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.HashSet;
import java.util.List;


public class CategoryAdapter extends BaseQuickAdapter<CategoryBean, BaseViewHolder> {
    public static final int SHOW_LAB_NUM = 7;//每个item下展示几个标签

    Activity activity;
    public CategoryAdapter(List<CategoryBean> data, Activity activity) {
        super(R.layout.item_lab_title, data);
        this.activity = activity;
    }

    @Override
    protected void convert(BaseViewHolder helper, CategoryBean item) {
        helper.setText(R.id.tvTitle, item.getTypename());
        final TagFlowLayout flowLayout = helper.getView(R.id.flowlayout);//子类别
        final List<CategoryBean.ChildBean> child = item.getChild();
        int size = child.size();
        final int labLen = child.size();
        LabAdapter labAdapter = new LabAdapter(child, activity);
        flowLayout.setAdapter(labAdapter);
        flowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                CategoryBean.ChildBean bean = child.get(position);
                bean.setIsCheck(!bean.isIsCheck());//选中或者取消选中
                return false;
            }
        });
        HashSet<Integer> posSet = new HashSet<>();
        for (int i = 0; i < labLen; i++) {//判断是否被选中
            CategoryBean.ChildBean childBean = child.get(i);
            if (childBean.isIsCheck()) {
                posSet.add(i);
            }
            labAdapter.setSelectedList(posSet);
        }

        final TextView tvAll = helper.getView(R.id.tvAll);
        if (size >= SHOW_LAB_NUM) {//全部展示,隐藏按钮
            tvAll.setVisibility(View.VISIBLE);
            tvAll.setText("全部");
            for (int i = 0; i < labLen; i++) {//折叠
                if (i >= SHOW_LAB_NUM) {
                    flowLayout.getChildAt(i).setVisibility(View.GONE);
                }
            }
        } else {
            tvAll.setVisibility(View.GONE);
        }

        tvAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int h = 0;
                if (tvAll.getText().toString().equals("全部")) {
                    for (int i = 0; i < labLen; i++) {//展开
                        flowLayout.getChildAt(i).setVisibility(View.VISIBLE);
                        tvAll.setText("收起");
//                        h = h + flowLayout.getChildAt(i).getHeight();
                    }
                } else {
                    tvAll.setText("全部");
                    for (int i = 0; i < labLen; i++) {//折叠
                        if (i > SHOW_LAB_NUM) {
                            flowLayout.getChildAt(i).setVisibility(View.GONE);
                        }
                    }
                }
            }
        });
    }
}
