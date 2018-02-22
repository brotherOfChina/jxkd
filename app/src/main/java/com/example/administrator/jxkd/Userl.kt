package com.example.administrator.jxkd

/**
 * Created by Administrator
 *  on 2018/2/21 0021.
 */
data class User(val status: Int,
                     val msg: String,
                     val data: DataBean) {

    data class DataBean(val isStorer: String,
                        val scoreLevel: String,
                        val userid: String,
                        val username: String,
                        val nickname: String,
                        val avatar: String,
                        val gender: String,
                        val bts_score: Int,
                        val bts_bean: String,
                        val msgNum: String,
                        val ScoreCNum: String,
                        val BeanCNum: String,
                        val is_q: String,
                        val is_msg: Int,
                        val is_frendmsg: Int,
                        val q_count: String,
                        val consignee: ConsigneeBean) {

        data class ConsigneeBean(val consignee_name: String,
                                 val consignee_phone: String,
                                 val consignee_region_name: String,
                                 val street_id: String,
                                 val street_name: String,
                                 val consignee_address: String,
                                 val shuliang: ShuliangBean) {

            data class ShuliangBean(val totalnum: String,
                                    val totalnum1: String,
                                    val totalnum2: String)
        }
    }
}