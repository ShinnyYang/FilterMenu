package com.zong.filter;

import java.util.List;

public class CategoryBean {

    /**
     * error :
     * msg : 请求成功！
     * list : [{"types":16,"typename":"分类","child":[{"id":22,"isCheck":false,"typename":"原石"},{"id":23,"isCheck":false,"typename":"挂件"},{"id":24,"isCheck":false,"typename":"耳饰"},{"id":26,"isCheck":false,"typename":"手饰"},{"id":36,"isCheck":false,"typename":"项链"},{"id":37,"isCheck":false,"typename":"摆件"},{"id":38,"isCheck":false,"typename":"配饰"},{"id":39,"typename":"头饰"},{"id":40,"isCheck":false,"typename":"把件"},{"id":41,"isCheck":false,"typename":"器皿件"},{"id":42,"isCheck":false,"typename":"珠子"},{"id":43,"isCheck":false,"typename":"杂项"},{"id":70,"isCheck":false,"typename":"戒指"},{"id":71,"isCheck":false,"typename":"吊坠"},{"id":74,"isCheck":false,"typename":"手镯"},{"id":75,"isCheck":false,"typename":"玉牌"},{"id":78,"isCheck":false,"typename":"皮带扣"}]},{"types":2,"typename":"题材","child":[{"id":44,"isCheck":false,"typename":"神佛"},{"id":45,"isCheck":false,"typename":"瑞兽"},{"id":46,"isCheck":false,"typename":"仿古"},{"id":47,"isCheck":false,"typename":"山水"},{"id":48,"isCheck":false,"typename":"人物"},{"id":49,"isCheck":false,"typename":"生肖"},{"id":50,"isCheck":false,"typename":"动物"},{"id":51,"isCheck":false,"typename":"花"},{"id":52,"isCheck":false,"typename":"植物"},{"id":53,"isCheck":false,"typename":"蔬果"},{"id":72,"isCheck":false,"typename":"佛"},{"id":76,"isCheck":false,"typename":"童子"},{"id":77,"isCheck":false,"typename":"貔貅"}]},{"types":2,"typename":"种类","child":[{"id":54,"isCheck":false,"typename":"白玉"},{"id":55,"isCheck":false,"typename":"青白玉"},{"id":56,"isCheck":false,"typename":"白带翠"},{"id":57,"isCheck":false,"typename":"青玉"},{"id":58,"isCheck":false,"typename":"碧玉"},{"id":59,"isCheck":false,"typename":"墨玉"},{"id":60,"isCheck":false,"typename":"糖玉"},{"id":61,"isCheck":false,"typename":"黄口料"},{"id":62,"isCheck":false,"typename":"糖沁"},{"id":63,"isCheck":false,"typename":"桃花玉"},{"id":64,"isCheck":false,"typename":"石包玉"},{"id":65,"isCheck":false,"typename":"鸡骨白"},{"id":73,"isCheck":false,"typename":"黄沁"}]},{"types":2,"typename":"皮色","child":[{"id":66,"isCheck":false,"typename":"黄皮"},{"id":67,"isCheck":false,"typename":"红皮"},{"id":68,"isCheck":false,"typename":"黑皮"},{"id":69,"isCheck":false,"typename":"秋梨皮"}]}]
     */

    private String error;
    private String msg;
    private List<ListBean> list;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * types : 16
         * typename : 分类
         * child : [{"id":22,"isCheck":false,"typename":"原石"},{"id":23,"isCheck":false,"typename":"挂件"},{"id":24,"isCheck":false,"typename":"耳饰"},{"id":26,"isCheck":false,"typename":"手饰"},{"id":36,"isCheck":false,"typename":"项链"},{"id":37,"isCheck":false,"typename":"摆件"},{"id":38,"isCheck":false,"typename":"配饰"},{"id":39,"typename":"头饰"},{"id":40,"isCheck":false,"typename":"把件"},{"id":41,"isCheck":false,"typename":"器皿件"},{"id":42,"isCheck":false,"typename":"珠子"},{"id":43,"isCheck":false,"typename":"杂项"},{"id":70,"isCheck":false,"typename":"戒指"},{"id":71,"isCheck":false,"typename":"吊坠"},{"id":74,"isCheck":false,"typename":"手镯"},{"id":75,"isCheck":false,"typename":"玉牌"},{"id":78,"isCheck":false,"typename":"皮带扣"}]
         */

        private int types;
        private String typename;
        private List<ChildBean> child;

        public int getTypes() {
            return types;
        }

        public void setTypes(int types) {
            this.types = types;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public List<ChildBean> getChild() {
            return child;
        }

        public void setChild(List<ChildBean> child) {
            this.child = child;
        }

        public static class ChildBean {
            /**
             * id : 22
             * isCheck : false
             * typename : 原石
             */

            private int id;
            private boolean isCheck;
            private String typename;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isIsCheck() {
                return isCheck;
            }

            public void setIsCheck(boolean isCheck) {
                this.isCheck = isCheck;
            }

            public String getTypename() {
                return typename;
            }

            public void setTypename(String typename) {
                this.typename = typename;
            }
        }
    }
}
