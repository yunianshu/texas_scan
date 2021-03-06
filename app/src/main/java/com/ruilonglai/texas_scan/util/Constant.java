package com.ruilonglai.texas_scan.util;

import com.ruilonglai.texas_scan.R;
import com.ruilonglai.texas_scan.entity.PlayerData;

/**
 * Created by WangShuai on 2017/5/3.
 */

public final class Constant {

    public final static String[] PLATFORM = new String[]{"dpq","dyq","pkbl-mtt","pkbl-sng"};
    public final static String[] APPNAMES = {"德扑圈","德友圈","扑克部落MTT","扑克部落SNG"};
    public final static String[] ROUND = {"翻牌前","","","翻牌圈","转牌圈","河牌圈"};
    public final static String[] seatFlags = {"BTN", "SB", "BB", "UTG", "UTG+1", "MP", "MP+1", "HJ", "CO"};
    public final static int[] colors = {R.color.numbers_text_color,R.color.color1,R.color.color2,R.color.color3,R.color.color4,R.color.color5,R.color.color6,R.color.color7,R.color.color8};

    public final static int FLAG_REMARK = 0;
    public final static int FLAG_NOTE = 1;
    public final static int FLAG_CHANGE_COLOR = 2;

    public final static String[] ACTIONS = {"加注","ALLIN","跟注","看牌","弃牌","straddle","下注","Open","3bet"};
    public final static int ACTION_CHECK = 3;//让牌
    public final static int ACTION_CALL = 2;//跟进
    public final static int ACTION_BET = 6;//下注
    public final static int ACTION_FOLD = 4;//弃牌
    public final static int ACTION_ALLIN = 1;//全压
    public final static int ACTION_RAISE = 0;//加注
    public final static int ACTION_STRADDLE = 5;//straddle
    public final static int ACTION_OPEN = 7;//open
    public final static int ACTION_3Bet = 8;//3bet


    //德友圈
    public final static int ACTION_DYQ_CHECK = 3;//让牌
    public final static int ACTION_DYQ_CALL = 2;//跟进
    public final static int ACTION_DYQ_STRADDLE = 5;//straddle
    public final static int ACTION_DYQ_FOLD = 4;//弃牌
    public final static int ACTION_DYQ_ALLIN = 1;//全压
    public final static int ACTION_DYQ_RAISE = 0;//加注
    public final static int ACTION_DYQ_BET = 6;//下注
    public final static int ACTION_DYQ_OPEN = 7;//open
    public final static int ACTION_DYQ_3BET = 8;//3bet
    //德扑圈
    public final static int ACTION_DPQ_CHECK = 3;//让牌
    public final static int ACTION_DPQ_CALL = 2;//跟进
    public final static int ACTION_DPQ_STRADDLE = 5;//straddle
    public final static int ACTION_DPQ_FOLD = 4;//弃牌
    public final static int ACTION_DPQ_ALLIN = 1;//全压
    public final static int ACTION_DPQ_RAISE = 0;//加注
    //扑克部落
    public final static int ACTION_PKBL_CHECK = 3;//让牌
    public final static int ACTION_PKBL_CALL = 2;//跟进
    public final static int ACTION_PKBL_FOLD = 4;//弃牌
    public final static int ACTION_PKBL_ALLIN = 1;//全压
    public final static int ACTION_PKBL_RAISE = 0;//加注

    public final static int ROUND_PREFLOP = 0;//翻牌前
    public final static int ROUND_FLOP = 3;//翻牌圈
    public final static int ROUND_TURN = 4;//转牌圈
    public final static int ROUND_RIVER = 5;//河牌圈

    public final static int MSG_FROM_CLIENT = 0;//客户端信息
    public final static int MSG_FROM_SERVER = 1;//服务器信息

    public final static int SOCKET_RESTART_MAIN_PROCESS = 0;//重启Main进程
    public final static int SOCKET_ONE_HAND_LOG = 3;//saveParams
    public final static int SOCKET_BOARDS_AND_POKERS = 4;//boards,pokers
    public final static int SOCKET_EXIT = 5;//exit

    public final static int SOCKET_OPEN_WINDOW = 6;
    public final static int SOCKET_CLOSE_WINDOW = 7;

    public final static int SOCKET_PLATFORM_TEXASPOKER = 8;//德扑圈
    public final static int SOCKET_PLATFORM_POKERFISHS = 9;//德友圈
    public final static int SOCKET_PLATFORM_NUTSPOKER = 10;//扑克部落
    public final static int SOCKET_PLATFORM_NUTSPOKER_SNG = 11;//扑克部落SNG
    public final static int SOCKET_KNOW_NAME = 12;//识别出名字
    public final static int SOCKET_SEATCOUNT = 13;//seatCount;
    public final static int SOCKET_IS_WATCH = 14;//是否是旁观者模式
    public final static int SOCKET_GET_TEMPLATE = 15;//获取重新初始化模板
    public final static int SOCKET_SEATCOUNT_CHANGE = 16;//座位数变化
    public final static int SOCKET_SCANNAME = 17;//调用接口识别名字
    public final static int SOCKET_UPDATE_NAME = 18;//修改名字
    public final static int SOCKET_UPDATE_REMARK = 19;//修改备注
    public final static int SOCKET_UPDATE_LEVER = 20;//修改标记

    public final static int TYPE_PERSON = 0;
    public final static int TYPE_OBSERVER = 1;

    public final static int TEST_SEATCOUNT = 0;//截图测试座位数
    public final static int TEST_NAME = 1;//截图测试名字


    public final static int DELETE_PLAYER = 1;//删除玩家的数据
    public final static int DELETE_SELF = 2;//删除自己的数据

    /*悬浮窗位置1080*1920*/
    public final static int[][][][] winPos_1080 = {
            {
                    {
                            {30, 165, 80, 40},
                            {300, 995, 350, -2},
                            {160, 165, 100, 100},
                            {90, 700, 100, 100},
                            {90, 1040, 100, 100},
                            {110, 1415, 100, 100},
                            {140, 1560, 100, 100},
                            {140, 1560, 100, 100},
                            {90, 1415, 100, 100},
                            {90, 1040, 100, 100},
                            {90, 700, 100, 100},
                            {300, 270, 100, 100},
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {60, 555, 100, 50},
                            {60, 795, 100, 50},
                            {60, 1020, 100, 50},
                            {450, 1150, 100, 50},
                            {60, 1020, 100, 50},
                            {60, 795, 100, 50},
                            {60, 555, 100, 50},
                            {200, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {15,  580, 100, 50},
                            {15,  970, 100, 50},
                            {80, 1120, 100, 50},
                            {80, 1120, 100, 50},
                            {15, 970, 100, 50},
                            {15, 580, 100, 50},
                            {200, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {30,  330, 100, 50},
                            {30,  980, 100, 50},
                            {450, 1150, 100, 50},
                            {30, 980, 100, 50},
                            {30, 330, 100, 50},
                            {200, 180, 100, 50},
                    },
                    {
                            {20, 110, 80, 40},
                            {200, 730, 350, -2},
                            {100, 110, 100, 50},
                            {420, 1150, 100, 50},
                            {200, 180, 100, 50},
                    },
            },
            {
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {32, 350, 100, 50},
                            {32, 600, 100, 50},
                            {32, 845, 100, 50},
                            {100, 1120, 100, 50},
                            {100, 1120, 100, 50},
                            {32, 845, 100, 50},
                            {32, 600, 100, 50},
                            {32, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {32, 350, 100, 50},
                            {32, 600, 100, 50},
                            {32, 845, 100, 50},
                            {420, 1150, 100, 50},
                            {32, 845, 100, 50},
                            {32, 600, 100, 50},
                            {32, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {30,  400, 100, 50},
                            {30,  790, 100, 50},
                            {100, 1120, 100, 50},
                            {560, 1120, 100, 50},
                            {30, 790, 100, 50},
                            {30, 400, 100, 50},
                            {100, 130, 100, 50},
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {30,  400, 100, 50},
                            {30,  790, 100, 50},
                            {420, 1150, 100, 50},
                            {30, 790, 100, 50},
                            {30, 400, 100, 50},
                            {100, 130, 100, 50},
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {420, 1150, 100, 50},
                            {100, 130, 100, 50}
                    },
            },
            {
                    {
                            {30, 165, 80, 40},
                            {300, 995, 350, -2},
                            {160, 165, 100, 100},
                            {90, 700, 100, 100},
                            {90, 1040, 100, 100},
                            {110, 1410, 100, 100},
                            {140, 1560, 100, 100},
                            {875, 1560, 100, 100},
                            {865, 1410, 100, 100},
                            {865, 1040, 100, 100},
                            {865, 700, 100, 100},
                            {300, 270, 100, 100},
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {32, 350, 100, 50},
                            {32, 600, 100, 50},
                            {32, 845, 100, 50},
                            {420, 1150, 100, 50},
                            {600, 845, 100, 50},
                            {600, 600, 100, 50},
                            {600, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {30,  400, 100, 50},
                            {30,  790, 100, 50},
                            {420, 1150, 100, 50},
                            {600, 790, 100, 50},
                            {600, 400, 100, 50},
                            {100, 130, 100, 50}
                    }
            },
            {
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {20, 350, 100, 50},
                            {20, 580, 100, 50},
                            {20, 810, 100, 50},
                            {240, 1150, 100, 50},
                            {380, 1150, 100, 50},
                            {600, 810, 100, 50},
                            {600, 580, 100, 50},
                            {600, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {32, 350, 100, 50},
                            {32, 600, 100, 50},
                            {32, 845, 100, 50},
                            {420, 1150, 100, 50},
                            {600, 845, 100, 50},
                            {600, 600, 100, 50},
                            {600, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {15,  580, 100, 50},
                            {15,  970, 100, 50},
                            {80, 1120, 100, 50},
                            {570, 1120, 100, 50},
                            {600, 970, 100, 50},
                            {600, 580, 100, 50},
                            {200, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 730, 350, -2},
                            {100, 130, 100, 50},
                            {30,  580, 100, 50},
                            {30,  950, 100, 50},
                            {450, 1150, 100, 50},
                            {600, 950, 100, 50},
                            {600, 580, 100, 50},
                            {100, 130, 100, 50}
                    }
            }
    };/*悬浮窗位置720*1280*/
    public final static int[][][][] winPos = {
            {
                    {
                            {20, 110, 80, 40},
                            {190, 680, 350, -2},
                            {100, 110, 100, 50},
                            {0, 558, 100, 50},
                            {0, 798, 100, 50},
                            {0, 1030, 100, 50},
                            {20, 1110, 100, 50},
                            {20, 1110, 100, 50},
                            {0, 1030, 100, 50},
                            {0, 798, 100, 50},
                            {0, 558, 100, 50},
                            {140, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {190, 680, 350, -2},
                            {100, 130, 100, 50},
                            {0, 558, 100, 50},
                            {0, 798, 100, 50},
                            {0, 1030, 100, 50},
                            {450, 1150, 100, 50},
                            {0, 1030, 100, 50},
                            {0, 798, 100, 50},
                            {0, 558, 100, 50},
                            {140, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {190, 680, 350, -2},
                            {100, 130, 100, 50},
                            {0,  585, 100, 50},
                            {0,  970, 100, 50},
                            {20, 1110, 100, 50},
                            {20, 1110, 100, 50},
                            {0, 970, 100, 50},
                            {0, 585, 100, 50},
                            {120, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {190, 680, 350, -2},
                            {100, 130, 100, 50},
                            {0,  350, 100, 50},
                            {0,  980, 100, 50},
                            {450, 1150, 100, 50},
                            {0, 980, 100, 50},
                            {0, 350, 100, 50},
                            {140, 180, 100, 50},
                    },
                    {
                            {20, 110, 80, 40},
                            {190, 680, 350, -2},
                            {100, 110, 100, 50},
                            {420, 1150, 100, 50},
                            {140, 180, 100, 50},
                    },
            },
            {
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {40, 130, 100, 50},
                            {0, 350, 100, 50},
                            {0, 600, 100, 50},
                            {0, 845, 100, 50},
                            {40, 1120, 100, 50},
                            {40, 1120, 100, 50},
                            {0, 845, 100, 50},
                            {0, 600, 100, 50},
                            {0, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {40, 130, 100, 50},
                            {0, 350, 100, 50},
                            {0, 600, 100, 50},
                            {0, 845, 100, 50},
                            {420, 1150, 100, 50},
                            {0, 845, 100, 50},
                            {0, 600, 100, 50},
                            {0, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {40, 130, 100, 50},
                            {0,  400, 100, 50},
                            {0,  790, 100, 50},
                            {40, 1120, 100, 50},
                            {40, 1120, 100, 50},
                            {0, 790, 100, 50},
                            {0, 400, 100, 50},
                            {100, 130, 100, 50},
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {40, 130, 100, 50},
                            {0,  400, 100, 50},
                            {0,  790, 100, 50},
                            {420, 1150, 100, 50},
                            {0, 790, 100, 50},
                            {0, 400, 100, 50},
                            {100, 130, 100, 50},
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {40, 130, 100, 50},
                            {420, 1150, 100, 50},
                            {100, 130, 100, 50}
                    },
            },
            {
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0, 350, 100, 50},
                            {0, 580, 100, 50},
                            {0, 810, 100, 50},
                            {0, 1040, 100, 50},
                            {0, 1040, 100, 50},
                            {0, 810, 100, 50},
                            {0, 580, 100, 50},
                            {0, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0, 350, 100, 50},
                            {0, 600, 100, 50},
                            {0, 845, 100, 50},
                            {420, 1150, 100, 50},
                            {0, 845, 100, 50},
                            {0, 600, 100, 50},
                            {0, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0,  400, 100, 50},
                            {0,  790, 100, 50},
                            {420, 1150, 100, 50},
                            {0, 790, 100, 50},
                            {0, 400, 100, 50},
                            {100, 130, 100, 50}
                    }
            },
            {
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0, 350, 100, 50},
                            {0, 580, 100, 50},
                            {0, 810, 100, 50},
                            {240, 1150, 100, 50},
                            {240, 1150, 100, 50},
                            {0, 810, 100, 50},
                            {0, 580, 100, 50},
                            {0, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 210, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0, 350, 100, 50},
                            {0, 600, 100, 50},
                            {0, 845, 100, 50},
                            {420, 1150, 100, 50},
                            {0, 845, 100, 50},
                            {0, 600, 100, 50},
                            {0, 350, 100, 50},
                            {100, 130, 100, 50}
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0,  580, 100, 50},
                            {0,  970, 100, 50},
                            {80, 1120, 100, 50},
                            {80, 1120, 100, 50},
                            {0, 970, 100, 50},
                            {0, 580, 100, 50},
                            {200, 180, 100, 50},
                    },
                    {
                            {50, 230, 80, 40},
                            {200, 700, 350, -2},
                            {100, 130, 100, 50},
                            {0,  580, 100, 50},
                            {0,  950, 100, 50},
                            {450, 1150, 100, 50},
                            {0, 950, 100, 50},
                            {0, 580, 100, 50},
                            {100, 130, 100, 50}
                    }
            }
    };
    /*概率类型*/
    public final static int TYPE_HAND = 0;
    public final static int TYPE_VPIP = 1;
    public final static int TYPE_PFR = 2;
    public final static int TYPE_3BET = 3;
    public final static int TYPE_CB = 4;
    public final static int TYPE_AF = 5;
    public final static int TYPE_F3BET= 6;
    public final static int TYPE_STL = 7;
    public final static int TYPE_FSTL = 8;
    public final static int TYPE_FCB = 9;
    public final static int TYPE_FFLOP = 10;
    public final static int TYPE_FTURN = 11;
    public final static int TYPE_FRIVER = 12;
    public final static int TYPE_WTSD = 13;
    public final static int TYPE_WWSD = 14;


    public static String[] percentTypes = {
            "手数",
            "VPIP",
            "PFR",
            "3Bet",
            "CB",
            "AF",
            "F3Bet",
            "STL",
            "FSTL",
            "FCB",
            "FFlop",
            "FTurn",
            "FRiver",
            "WTSD",
            "W@SD"
    };
    public static String[] percentContents = {
            "记录的总手数",
            "主动进池的频率（大盲或straddle位过牌入池不计）",
            "翻牌前主动下注的频率",
            "面对有人加注,再次加注的频率,4bet,5bet等都算3bet",
            "翻牌前最后一个加注,在翻牌圈再加注的频率",
            "翻牌圈,转牌圈和河牌圈总的加注次数/总的跟注次数",
            "面对有人做3Bet动作后弃牌的频率",
            "在未加注过的底池，玩家在CO，按钮或者小盲注位置加注，称为偷盲",
            "玩家在面对偷盲企图时，弃牌的频率",
            "翻牌前的加注者在翻拍圈接着下注后跟进来的人弃牌",
            "在翻牌圈,弃牌的频率",
            "在转牌圈,弃牌的频率",
            "在河牌圈,弃牌的频率",
            "打到摊牌的频率",
            "摊牌后获胜的概率"
    };
    //保留几位小数
    public static String getDoubleString(int num,double count){
      return  String.format("%."+num+"f", count);
    }

    /*获取相应类型的概率*/
    public static String getPercent(PlayerData player, int type) {
        String percent = "－";
        int playCount = player.getPlayCount();
        switch (type) {
            case Constant.TYPE_HAND:
                if (playCount >= 1000) {
                    percent = playCount / 1000 + "K+";
                } else {
                    percent = "(" + playCount + ")";
                }
                break;
            case Constant.TYPE_VPIP:
                if (playCount != 0)
                    percent = disposeBadNumber(player.getJoinCount() * 100 / playCount) + "";
                break;
            case Constant.TYPE_PFR:
                if (playCount != 0)
                    percent = disposeBadNumber(player.getPfrCount() * 100 / playCount) + "";
                break;
            case Constant.TYPE_3BET:
                if (player.getFaceOpenCount() != 0)
                    percent = disposeBadNumber(player.getBet3Count() * 100 / player.getFaceOpenCount()) + "";
                break;
            case Constant.TYPE_CB:
                if (player.getLastRaiseCount() != 0)
                    percent = disposeBadNumber(player.getCbCount() * 100 / player.getLastRaiseCount()) + "";
                break;
            case Constant.TYPE_AF:
                if (player.getCallCount() != 0) {
                    double af = player.getRaiseCount() / Double.valueOf(player.getCallCount());
                    if (af > 10) {
                        af = af / 2;
                    }
                    percent = String.format("%.1f", af);
                }

                break;
            case Constant.TYPE_F3BET:
                if (player.getFace3BetCount() != 0)
                    percent = disposeBadNumber(player.getFold3BetCount() * 100 / player.getFace3BetCount()) + "";
                break;
            case Constant.TYPE_STL:
                if (player.getStlPosCount() != 0)
                    percent = disposeBadNumber(player.getStlCount() * 100 / player.getStlPosCount()) + "";
                break;
            case Constant.TYPE_FSTL:
                if (player.getFaceStlCount() != 0)
                    percent = disposeBadNumber(player.getFoldStlCount() * 100 / player.getFaceStlCount()) + "";
                break;
            case Constant.TYPE_FCB:
                if (player.getFaceCbCount() != 0)
                    percent = disposeBadNumber(player.getFoldCbCount() * 100 / player.getFaceCbCount()) + "";
                break;
            case Constant.TYPE_FFLOP:
                if (player.getFlopCount() != 0 && playCount != 0)
                    percent = disposeBadNumber(player.getFoldFlopCount() * 100 / player.getFlopCount()) + "";
                break;
            case Constant.TYPE_FTURN:
                if (player.getTurnCount() != 0 && playCount != 0)
                    percent = disposeBadNumber(player.getFoldTurnCount() * 100 / player.getTurnCount()) + "";
                break;
            case Constant.TYPE_FRIVER:
                if (player.getRiverCount() != 0 && playCount != 0)
                    percent = disposeBadNumber(player.getFoldRiverCount() * 100 / player.getRiverCount()) + "";
                break;
            case Constant.TYPE_WTSD:
                if(player.getJoinCount() != 0 && playCount!=0)
                    percent = disposeBadNumber(player.getTurnRiverCount()*100 / player.getJoinCount())+"";
                break;
            case Constant.TYPE_WWSD:
                if(playCount!=0 && player.getTurnRiverCount()!=0)
                    percent = disposeBadNumber(player.getWinTurnRiverCount()*100 / player.getTurnRiverCount())+"";
        }
        return percent;
    }
    /*超过100的变为100*/
    public static int disposeBadNumber(int num){
        if(num>100)
            num = 100;
        return num;
    }

}
