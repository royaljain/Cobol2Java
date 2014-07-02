public class Main { 
 
 // Program-ID  SRJLNK002     Author  WORKS . 
 // SOURCE COMPUTER   YHP    OBJECT COMPUTER  YHP . 
String DBNAME = null ;
String FILL = "00" ;
String MENU-ID = SPACE ;
String PGMNAME = "srjlnk002" ;
String JOB-ID = SPACE ;
double SYA-ID = 0 ;
String LNK-DATE = SPACE ;
double HR-NO = 0 ;
double HRRK-KB = 0 ;
double HR-NO-WK = 0 ;
double HRRK-KB-WK = 0 ;
double TRN-KB = 0 ;
double LNK-DATE-KB = 0 ;
String MERGE-SDATE = null ;
String MERGE-EDATE = null ;
String MERGED-EDATE = null ;
double MERGE-STATUS = null;
String LNK-EDATE = SPACE ;
String SUBCOM-SQL = SPACE ;
double SUBCOM-SQL-SIZE = 150 ;
double SUBCOM-SQL-FC = ZERO ;
String NOW-YY = null ;
String FILL = "/" ;
String NOW-MM = null ;
String FILL = "/" ;
String NOW-DD = null ;
String FILL = " " ;
String NOW-HH = null ;
String FILL = ":" ;
String NOW-FF = null ;
String FILL = ":" ;
String NOW-SS = null ;
String SRK-LNK-DATE = null ;
String SRK-LNK-EDATE = null ;
String WK-FUTURE-DATE = null ;
String WK-PAST-DATE = null ;
double SRMST-MAX = 1000 ;
double SRKNM-MAX = 30 ;
double WK-STATUS = null;
double TGT-STATUS = null;
double CNT-SRMST = null;
double SRM-SYA-ID = null;
String SRM-SDATE = null ;
String SRM-EDATE = null ;
double SRM-HR-NO = null;
double SRM-HRRK-KB = null;
double SRM-STATUS = null;
double SRM-TRG-KB = null;
String SRM-SR-SYZ-CD = null ;
String SRM-SYZ-PRC-DATE = null ;
String SRM-SYZ-HAT-DATE = null ;
String SRM-CHAKUNIN-DATE = null ;
String SRM-KINMU-SYUBETU-CD = null ;
String SRM-KS-PRC-DATE = null ;
String SRM-KYUMU-SYUBETU-CD = null ;
double SRM-JITAN-KINMU-KB = null;
String SRM-JITAN-KINMU-CD = null ;
String SRM-JITAN-SYUBETU-CD = null ;
String SRM-SIME-CD = null ;
String SRM-CAL-CD = null ;
String SRM-KINMU-CAL-CD = null ;
String SRM-HOLIDAY-TYPE-CD = null ;
String SRM-HT-PRC-DATE = null ;
double SRM-SAGYO-KEITAI-KB = null;
String SRM-SAGYO-KEITAI-CD = null ;
double SRM-PROJECT-KB = null;
double SRM-KINMUNY-KB = null;
String SRM-KINMUNY-CD = null ;
double SRM-SYORI-KB = null;
String SRM-SSYORIGRP-CD = null ;
String SRM-KYUKA-KEITAI-CD = null ;
String SRM-SUMSYA-KB = null ;
String SRM-KINMU-PTN-CD1 = null ;
String SRM-KINMU-PTN-CD2 = null ;
String SRM-KINMU-PTN-CD3 = null ;
String SRM-KINMU-PTN-CD4 = null ;
String SRM-JIKAN-CHECK-CD1 = null ;
String SRM-JIKAN-CHECK-CD2 = null ;
String SRM-JIKAN-CHECK-CD3 = null ;
String SRM-SR-SYZ-CD-BK = null ;
double SRM-OUEN-FLG = null;
double SRM-KANRI-KB = null;
double SRM-ADMIN-KB = null;
double SRM-CAL-KB = null;
String SRM-NK-KINZ-KDT = null ;
String SRM-NK-FUYO-KDT = null ;
String SRM-RK-KINZ-KDT = null ;
String SRM-RK-FUYO-KDT = null ;
String SRM-IK-KINZ-KDT = null ;
double SRM-SYUK-KB = null;
double SRM-TAIS-KB = null;
double SRM-KYUS-KB = null;
String SRM-KAI-CD = null ;
String SRM-SKAI-CD = null ;
String SRM-GKAI-CD = null ;
String SRM-GSYZ-CD = null ;
String SRM-KYUSJ-CD = null ;
String SRM-KK-SYORI-CD = null ;
double SRM-KKOJ-MT = null;
double SRM-KKOJ-DT = null;
double SRM-IKKOJ-MT = null;
double SRM-IKKOJ-DT = null;
double SRM-KYUSTKKB = null;
String SRM-RENKYUS-TDT = null ;
String SRM-RENSYUK-TDT = null ;
double SRM-SR-SYA-KB = null;
double SRM-KUMI-KB = null;
String SRM-GENERAL-CD1 = null ;
String SRM-GENERAL-CD2 = null ;
String SRM-GENERAL-CD3 = null ;
String SRM-GENERAL-CD4 = null ;
String SRM-GENERAL-CD5 = null ;
String SRM-GENERAL-CD6 = null ;
String SRM-GENERAL-CD7 = null ;
String SRM-GENERAL-CD8 = null ;
String SRM-GENERAL-CD9 = null ;
String SRM-GENERAL-CD10 = null ;
String SRM-GENERAL-CD11 = null ;
String SRM-GENERAL-CD12 = null ;
String SRM-GENERAL-CD13 = null ;
String SRM-GENERAL-CD14 = null ;
String SRM-GENERAL-CD15 = null ;
String SRM-GENERAL-CD16 = null ;
String SRM-GENERAL-CD17 = null ;
String SRM-GENERAL-CD18 = null ;
String SRM-GENERAL-CD19 = null ;
String SRM-GENERAL-CD20 = null ;
String SRM-GENERAL-CD21 = null ;
String SRM-GENERAL-CD22 = null ;
String SRM-GENERAL-CD23 = null ;
String SRM-GENERAL-CD24 = null ;
String SRM-GENERAL-CD25 = null ;
String SRM-GENERAL-CD26 = null ;
String SRM-GENERAL-CD27 = null ;
String SRM-GENERAL-CD28 = null ;
String SRM-GENERAL-CD29 = null ;
String SRM-GENERAL-CD30 = null ;
double SRM-BOSS-KB = null;
double SRM-UNIT-SHIFT-KB = null;
String SRM-MLTCPNY-CD = null ;
double CNT-SRKNM = null;
double SRK-KNM-SEQ = null;
double SRK-END-STATUS = null;
String SRK-K-SR-SYZ-CD = null ;
String SRK-K-GENERAL-CD01 = null ;
String SRK-K-GENERAL-CD02 = null ;
String SRK-K-GENERAL-CD03 = null ;
String SRK-K-GENERAL-CD04 = null ;
String SRK-K-GENERAL-CD05 = null ;
String SRK-K-GENERAL-CD06 = null ;
String SRK-K-GENERAL-CD07 = null ;
String SRK-K-GENERAL-CD08 = null ;
String SRK-K-GENERAL-CD09 = null ;
String SRK-K-GENERAL-CD10 = null ;
double SRK-STATUS = null;
double SRK-INSERT-FLG = null;
double SRK-DUMMY-FLG = null;
double SRK-IS-STS0-FLG = null;
double WSRM-SYA-ID = null;
String WSRM-SDATE = null ;
String WSRM-EDATE = null ;
double WSRM-HR-NO = null;
double WSRM-HRRK-KB = null;
double WSRM-STATUS = null;
double WSRM-TRG-KB = null;
String WSRM-SR-SYZ-CD = null ;
String WSRM-SYZ-PRC-DATE = null ;
String WSRM-SYZ-HAT-DATE = null ;
String WSRM-CHAKUNIN-DATE = null ;
String WSRM-KINMU-SYUBETU-CD = null ;
String WSRM-KS-PRC-DATE = null ;
String WSRM-KYUMU-SYUBETU-CD = null ;
double WSRM-JITAN-KINMU-KB = null;
String WSRM-JITAN-KINMU-CD = null ;
String WSRM-JITAN-SYUBETU-CD = null ;
String WSRM-SIME-CD = null ;
String WSRM-CAL-CD = null ;
String WSRM-KINMU-CAL-CD = null ;
String WSRM-HOLIDAY-TYPE-CD = null ;
String WSRM-HT-PRC-DATE = null ;
double WSRM-SAGYO-KEITAI-KB = null;
String WSRM-SAGYO-KEITAI-CD = null ;
double WSRM-PROJECT-KB = null;
double WSRM-KINMUNY-KB = null;
String WSRM-KINMUNY-CD = null ;
double WSRM-SYORI-KB = null;
String WSRM-SSYORIGRP-CD = null ;
String WSRM-KYUKA-KEITAI-CD = null ;
String WSRM-SUMSYA-KB = null ;
String WSRM-KINMU-PTN-CD1 = null ;
String WSRM-KINMU-PTN-CD2 = null ;
String WSRM-KINMU-PTN-CD3 = null ;
String WSRM-KINMU-PTN-CD4 = null ;
String WSRM-JIKAN-CHECK-CD1 = null ;
String WSRM-JIKAN-CHECK-CD2 = null ;
String WSRM-JIKAN-CHECK-CD3 = null ;
String WSRM-SR-SYZ-CD-BK = null ;
double WSRM-OUEN-FLG = null;
double WSRM-KANRI-KB = null;
double WSRM-ADMIN-KB = null;
double WSRM-CAL-KB = null;
String WSRM-NK-KINZ-KDT = null ;
String WSRM-NK-FUYO-KDT = null ;
String WSRM-RK-KINZ-KDT = null ;
String WSRM-RK-FUYO-KDT = null ;
String WSRM-IK-KINZ-KDT = null ;
double WSRM-SYUK-KB = null;
double WSRM-TAIS-KB = null;
double WSRM-KYUS-KB = null;
String WSRM-KAI-CD = null ;
String WSRM-SKAI-CD = null ;
String WSRM-GKAI-CD = null ;
String WSRM-GSYZ-CD = null ;
String WSRM-KYUSJ-CD = null ;
String WSRM-KK-SYORI-CD = null ;
double WSRM-KKOJ-MT = null;
double WSRM-KKOJ-DT = null;
double WSRM-IKKOJ-MT = null;
double WSRM-IKKOJ-DT = null;
double WSRM-KYUSTKKB = null;
String WSRM-RENKYUS-TDT = null ;
String WSRM-RENSYUK-TDT = null ;
double WSRM-SR-SYA-KB = null;
double WSRM-KUMI-KB = null;
String WSRM-GENERAL-CD1 = null ;
String WSRM-GENERAL-CD2 = null ;
String WSRM-GENERAL-CD3 = null ;
String WSRM-GENERAL-CD4 = null ;
String WSRM-GENERAL-CD5 = null ;
String WSRM-GENERAL-CD6 = null ;
String WSRM-GENERAL-CD7 = null ;
String WSRM-GENERAL-CD8 = null ;
String WSRM-GENERAL-CD9 = null ;
String WSRM-GENERAL-CD10 = null ;
String WSRM-GENERAL-CD11 = null ;
String WSRM-GENERAL-CD12 = null ;
String WSRM-GENERAL-CD13 = null ;
String WSRM-GENERAL-CD14 = null ;
String WSRM-GENERAL-CD15 = null ;
String WSRM-GENERAL-CD16 = null ;
String WSRM-GENERAL-CD17 = null ;
String WSRM-GENERAL-CD18 = null ;
String WSRM-GENERAL-CD19 = null ;
String WSRM-GENERAL-CD20 = null ;
String WSRM-GENERAL-CD21 = null ;
String WSRM-GENERAL-CD22 = null ;
String WSRM-GENERAL-CD23 = null ;
String WSRM-GENERAL-CD24 = null ;
String WSRM-GENERAL-CD25 = null ;
String WSRM-GENERAL-CD26 = null ;
String WSRM-GENERAL-CD27 = null ;
String WSRM-GENERAL-CD28 = null ;
String WSRM-GENERAL-CD29 = null ;
String WSRM-GENERAL-CD30 = null ;
double WSRM-BOSS-KB = null;
double WSRM-UNIT-SHIFT-KB = null;
String WSRM-MLTCPNY-CD = null ;
double CSRM-SYA-ID = null;
String CSRM-SDATE = null ;
String CSRM-EDATE = null ;
double CSRM-HR-NO = null;
double CSRM-HRRK-KB = null;
double CSRM-STATUS = null;
double CSRM-TRG-KB = null;
String CSRM-SR-SYZ-CD = null ;
String CSRM-SYZ-PRC-DATE = null ;
String CSRM-SYZ-HAT-DATE = null ;
String CSRM-CHAKUNIN-DATE = null ;
String CSRM-KINMU-SYUBETU-CD = null ;
String CSRM-KS-PRC-DATE = null ;
String CSRM-KYUMU-SYUBETU-CD = null ;
double CSRM-JITAN-KINMU-KB = null;
String CSRM-JITAN-KINMU-CD = null ;
String CSRM-JITAN-SYUBETU-CD = null ;
String CSRM-SIME-CD = null ;
String CSRM-CAL-CD = null ;
String CSRM-KINMU-CAL-CD = null ;
String CSRM-HOLIDAY-TYPE-CD = null ;
String CSRM-HT-PRC-DATE = null ;
double CSRM-SAGYO-KEITAI-KB = null;
String CSRM-SAGYO-KEITAI-CD = null ;
double CSRM-PROJECT-KB = null;
double CSRM-KINMUNY-KB = null;
String CSRM-KINMUNY-CD = null ;
double CSRM-SYORI-KB = null;
String CSRM-SSYORIGRP-CD = null ;
String CSRM-KYUKA-KEITAI-CD = null ;
String CSRM-SUMSYA-KB = null ;
String CSRM-KINMU-PTN-CD1 = null ;
String CSRM-KINMU-PTN-CD2 = null ;
String CSRM-KINMU-PTN-CD3 = null ;
String CSRM-KINMU-PTN-CD4 = null ;
String CSRM-JIKAN-CHECK-CD1 = null ;
String CSRM-JIKAN-CHECK-CD2 = null ;
String CSRM-JIKAN-CHECK-CD3 = null ;
String CSRM-SR-SYZ-CD-BK = null ;
double CSRM-OUEN-FLG = null;
double CSRM-KANRI-KB = null;
double CSRM-ADMIN-KB = null;
double CSRM-CAL-KB = null;
String CSRM-NK-KINZ-KDT = null ;
String CSRM-NK-FUYO-KDT = null ;
String CSRM-RK-KINZ-KDT = null ;
String CSRM-RK-FUYO-KDT = null ;
String CSRM-IK-KINZ-KDT = null ;
double CSRM-SYUK-KB = null;
double CSRM-TAIS-KB = null;
double CSRM-KYUS-KB = null;
String CSRM-KAI-CD = null ;
String CSRM-SKAI-CD = null ;
String CSRM-GKAI-CD = null ;
String CSRM-GSYZ-CD = null ;
String CSRM-KYUSJ-CD = null ;
String CSRM-KK-SYORI-CD = null ;
double CSRM-KKOJ-MT = null;
double CSRM-KKOJ-DT = null;
double CSRM-IKKOJ-MT = null;
double CSRM-IKKOJ-DT = null;
double CSRM-KYUSTKKB = null;
String CSRM-RENKYUS-TDT = null ;
String CSRM-RENSYUK-TDT = null ;
double CSRM-SR-SYA-KB = null;
double CSRM-KUMI-KB = null;
String CSRM-GENERAL-CD1 = null ;
String CSRM-GENERAL-CD2 = null ;
String CSRM-GENERAL-CD3 = null ;
String CSRM-GENERAL-CD4 = null ;
String CSRM-GENERAL-CD5 = null ;
String CSRM-GENERAL-CD6 = null ;
String CSRM-GENERAL-CD7 = null ;
String CSRM-GENERAL-CD8 = null ;
String CSRM-GENERAL-CD9 = null ;
String CSRM-GENERAL-CD10 = null ;
String CSRM-GENERAL-CD11 = null ;
String CSRM-GENERAL-CD12 = null ;
String CSRM-GENERAL-CD13 = null ;
String CSRM-GENERAL-CD14 = null ;
String CSRM-GENERAL-CD15 = null ;
String CSRM-GENERAL-CD16 = null ;
String CSRM-GENERAL-CD17 = null ;
String CSRM-GENERAL-CD18 = null ;
String CSRM-GENERAL-CD19 = null ;
String CSRM-GENERAL-CD20 = null ;
String CSRM-GENERAL-CD21 = null ;
String CSRM-GENERAL-CD22 = null ;
String CSRM-GENERAL-CD23 = null ;
String CSRM-GENERAL-CD24 = null ;
String CSRM-GENERAL-CD25 = null ;
String CSRM-GENERAL-CD26 = null ;
String CSRM-GENERAL-CD27 = null ;
String CSRM-GENERAL-CD28 = null ;
String CSRM-GENERAL-CD29 = null ;
String CSRM-GENERAL-CD30 = null ;
double CSRM-BOSS-KB = null;
double CSRM-UNIT-SHIFT-KB = null;
String CSRM-MLTCPNY-CD = null ;
double CSRM-CNT-SRKNM = null;
double CSRK-KNM-SEQ = null;
double CSRK-END-STATUS = null;
String CSRK-K-SR-SYZ-CD = null ;
String CSRK-K-GENERAL-CD01 = null ;
String CSRK-K-GENERAL-CD02 = null ;
String CSRK-K-GENERAL-CD03 = null ;
String CSRK-K-GENERAL-CD04 = null ;
String CSRK-K-GENERAL-CD05 = null ;
String CSRK-K-GENERAL-CD06 = null ;
String CSRK-K-GENERAL-CD07 = null ;
String CSRK-K-GENERAL-CD08 = null ;
String CSRK-K-GENERAL-CD09 = null ;
String CSRK-K-GENERAL-CD10 = null ;
double CSRK-STATUS = null;
double CSRK-INSERT-FLG = null;
double CSRK-DUMMY-FLG = null;
double CSRK-IS-STS0-FLG = null;
double COM-SYA-ID = null;
String COM-SDATE = null ;
String COM-EDATE = null ;
double COM-HR-NO = null;
double COM-HRRK-KB = null;
double COM-STATUS = null;
double COM-TRG-KB = null;
String COM-SR-SYZ-CD = null ;
String COM-SYZ-PRC-DATE = null ;
String COM-SYZ-HAT-DATE = null ;
String COM-CHAKUNIN-DATE = null ;
String COM-KINMU-SYUBETU-CD = null ;
String COM-KS-PRC-DATE = null ;
String COM-KYUMU-SYUBETU-CD = null ;
double COM-JITAN-KINMU-KB = null;
String COM-JITAN-KINMU-CD = null ;
String COM-JITAN-SYUBETU-CD = null ;
String COM-SIME-CD = null ;
String COM-CAL-CD = null ;
String COM-KINMU-CAL-CD = null ;
String COM-HOLIDAY-TYPE-CD = null ;
String COM-HT-PRC-DATE = null ;
double COM-SAGYO-KEITAI-KB = null;
String COM-SAGYO-KEITAI-CD = null ;
double COM-PROJECT-KB = null;
double COM-KINMUNY-KB = null;
String COM-KINMUNY-CD = null ;
double COM-SYORI-KB = null;
String COM-SSYORIGRP-CD = null ;
String COM-KYUKA-KEITAI-CD = null ;
String COM-SUMSYA-KB = null ;
String COM-KINMU-PTN-CD1 = null ;
String COM-KINMU-PTN-CD2 = null ;
String COM-KINMU-PTN-CD3 = null ;
String COM-KINMU-PTN-CD4 = null ;
String COM-JIKAN-CHECK-CD1 = null ;
String COM-JIKAN-CHECK-CD2 = null ;
String COM-JIKAN-CHECK-CD3 = null ;
String COM-SR-SYZ-CD-BK = null ;
double COM-OUEN-FLG = null;
double COM-KANRI-KB = null;
double COM-ADMIN-KB = null;
double COM-CAL-KB = null;
String COM-NK-KINZ-KDT = null ;
String COM-NK-FUYO-KDT = null ;
String COM-RK-KINZ-KDT = null ;
String COM-RK-FUYO-KDT = null ;
String COM-IK-KINZ-KDT = null ;
double COM-SYUK-KB = null;
double COM-TAIS-KB = null;
double COM-KYUS-KB = null;
String COM-KAI-CD = null ;
String COM-SKAI-CD = null ;
String COM-GKAI-CD = null ;
String COM-GSYZ-CD = null ;
String COM-KYUSJ-CD = null ;
String COM-KK-SYORI-CD = null ;
double COM-KKOJ-MT = null;
double COM-KKOJ-DT = null;
double COM-IKKOJ-MT = null;
double COM-IKKOJ-DT = null;
double COM-KYUSTKKB = null;
String COM-RENKYUS-TDT = null ;
String COM-RENSYUK-TDT = null ;
double COM-SR-SYA-KB = null;
double COM-KUMI-KB = null;
String COM-GENERAL-CD1 = null ;
String COM-GENERAL-CD2 = null ;
String COM-GENERAL-CD3 = null ;
String COM-GENERAL-CD4 = null ;
String COM-GENERAL-CD5 = null ;
String COM-GENERAL-CD6 = null ;
String COM-GENERAL-CD7 = null ;
String COM-GENERAL-CD8 = null ;
String COM-GENERAL-CD9 = null ;
String COM-GENERAL-CD10 = null ;
String COM-GENERAL-CD11 = null ;
String COM-GENERAL-CD12 = null ;
String COM-GENERAL-CD13 = null ;
String COM-GENERAL-CD14 = null ;
String COM-GENERAL-CD15 = null ;
String COM-GENERAL-CD16 = null ;
String COM-GENERAL-CD17 = null ;
String COM-GENERAL-CD18 = null ;
String COM-GENERAL-CD19 = null ;
String COM-GENERAL-CD20 = null ;
String COM-GENERAL-CD21 = null ;
String COM-GENERAL-CD22 = null ;
String COM-GENERAL-CD23 = null ;
String COM-GENERAL-CD24 = null ;
String COM-GENERAL-CD25 = null ;
String COM-GENERAL-CD26 = null ;
String COM-GENERAL-CD27 = null ;
String COM-GENERAL-CD28 = null ;
String COM-GENERAL-CD29 = null ;
String COM-GENERAL-CD30 = null ;
double COM-BOSS-KB = null;
double COM-UNIT-SHIFT-KB = null;
String COM-MLTCPNY-CD = null ;
double COM-CNT-SRKNM = null;
double COM-KNM-SEQ = null;
double COM-END-STATUS = null;
String COM-K-SR-SYZ-CD = null ;
String COM-K-GENERAL-CD01 = null ;
String COM-K-GENERAL-CD02 = null ;
String COM-K-GENERAL-CD03 = null ;
String COM-K-GENERAL-CD04 = null ;
String COM-K-GENERAL-CD05 = null ;
String COM-K-GENERAL-CD06 = null ;
String COM-K-GENERAL-CD07 = null ;
String COM-K-GENERAL-CD08 = null ;
String COM-K-GENERAL-CD09 = null ;
String COM-K-GENERAL-CD10 = null ;
double COM-SRK-STATUS = null;
double COM-SRK-INSERT-FLG = null;
double COM-INSERT-FLG = null;
double COM-IS-STS0-FLG = null;
double WSRK-SYA-ID = null;
String WSRK-SDATE = null ;
String WSRK-EDATE = null ;
double WSRK-KNM-SEQ = null;
double WSRK-END-STATUS = null;
String WSRK-K-SR-SYZ-CD = null ;
String WSRK-K-GENERAL-CD01 = null ;
String WSRK-K-GENERAL-CD02 = null ;
String WSRK-K-GENERAL-CD03 = null ;
String WSRK-K-GENERAL-CD04 = null ;
String WSRK-K-GENERAL-CD05 = null ;
String WSRK-K-GENERAL-CD06 = null ;
String WSRK-K-GENERAL-CD07 = null ;
String WSRK-K-GENERAL-CD08 = null ;
String WSRK-K-GENERAL-CD09 = null ;
String WSRK-K-GENERAL-CD10 = null ;
double WSRK-STATUS = null;
double WSRK-INSERT-FLG = null;
double WSRK-DUMMY-FLG = null;
double WSRK-IS-STS0-FLG = null;
String SEC-JOBID = null ;
double SEC-ENABLED = null;
String SEC-DATE = null ;
String PAR-ID-STR = null ;
double PR-CNT = null;
double PR-TIME = ZERO ;
double PM-ERROR-CNT = null;
double JL-PARA-CNT = null;
double JL-PARA-OK-CNT = null;
String P-SIM-KB = SPACE ;
double SIM-KB = null;
double DOING-SIM = null;
double DBHR-MAX = 1000 ;
double CNT-DBHR = null;
double KIHON-HR-MAX = 1000 ;
double CNT-KIHON-HR = null;
double DBTRNRK-MAX = 1000 ;
double CNT-DBTRNRK = null;
String C-PGMID = "SRJLNK002" ;
String C-MAX-DATE = "2382/12/31" ;
double CNT-LNKTRN = null;
double WS-SRTBL-NO = null;
String WS-SRFLD-ID = null ;
String WS-SRFLD-OVAL = null ;
String WS-SRFLD-OVAL-J = null ;
String WS-SRFLD-NVAL = null ;
String WS-SRFLD-NVAL-J = null ;
String WS-LNK-DATE = null ;
double WS-TRN-KB = null;
double WS-KNM-SEQ = null;
double WS-HR-NO = null;
double WS-HRRK-KB = null;
double WS-STATUS = null;
double WS-ENTRY-KB = null;
double WS-SYORI-FLG = null;
double OLD-SYA-ID = null;
String OLD-LNK-DATE = null ;
double OLD-HR-NO = null;
double OLD-HRRK-KB = null;
double OLD-STATUS = null;
double OLD-TRN-KB = null;
double OLD-LNK-DATE-KB = null;
String SRFLD-ID = null ;
String WK-VAL-CHR = null ;
double WK-VAL-DECEDT = null;
String DATE-NOW-YY = null ;
String DATE-NOW-MM = null ;
String DATE-NOW-DD = null ;
String DATE-NOW-HH = null ;
String DATE-NOW-FF = null ;
String DATE-NOW-SS = null ;
String  = null ;
double WK-ADD-DAYS = null;
String WK-DATE = null ;
double TMP-DATE-NUM = null;
double TMP-YEAR = null;
double TMP-MONTH = null;
double TMP-DAY = null;
String TMP-YEAR-STR = null ;
String TMP-MONTH-STR = null ;
String TMP-DAY-STR = null ;
double STRING-POINTER = null;
double LNKSYAIN-EOF-FLG = null;
double RESTORE-EOF-FLG = null;
double CHK-STS1-FLG = null;
double IS-STS0-FLG = null;
double SRM-EQUAL-DATE = null;
double SAME-DATA-FLG = null;
double FLG-END = null;
double IX = null;
double IY = null;
double IZ = null;
double SRM-IDX = null;
double SRM-IDX2 = null;
double KNM-IDX = null;
double KNM-IDX2 = null;
double SRM-PTR = null;
double SRM-PTR2 = null;
double KNM-PTR = null;
double KNM-PTR2 = null;
double WK-IDX = null;
double WK-IDX2 = null;
double WK-SRM-IDX = null;
double IX1 = null;
double IX2 = null;
double IX3 = null;
double IX4 = null;
double IX5 = null;
double IX8 = null;
double IX9 = null;
double IX6 = null;
double IX7 = null;
double DBHR-PTR = null;
double KIHON-HR-PTR = null;
double SRM-NEW-CNT = null;
double SRM-INS-CNT = null;
double SRM-UPD-CNT = null;
double SRM-DEL-CNT = null;
double SRK-NEW-CNT = null;
double SRK-INS-CNT = null;
double SRK-UPD-CNT = null;
double SRK-DEL-CNT = null;
double SRK-MRG-CNT = null;
double WK-TRN-CNT = null;
String  = "SELECT              " ;
String  = " rk.sya_id,         " ;
String  = " rk.srtbl_no,       " ;
String  = " rk.srfld_id,       " ;
String  = " rk.srfld_oval,     " ;
String  = " rk.srfld_nval,     " ;
String  = " to_char(rk.lnk_date," ;
String  = "     'YYYY/MM/DD'), " ;
String  = " rk.status,         " ;
String  = " rk.hr_no,          " ;
String  = " rk.hrrk_kb,        " ;
String  = " rk.trn_kb,         " ;
String  = " rk.knm_seq,        " ;
String  = " rk.entry_kb,       " ;
String  = " NVL(rk.lnk_date_kb,1)" ;
String  = " FROM sr_jlnktrn_rk rk " ;
String  = " WHERE rk.srtbl_no < 91000" ;
String  = " AND ((rk.syori_flg = 0 " ;
String PAST-JK-PAR = null ;
String FUTURE-JK-PAR = null ;
String  = " ) OR (rk.syori_flg = 1))" ;
String  = " AND rk.restore_flg = 0 " ;
String  = " AND EXISTS(        " ;
String  = " SELECT 1 FROM      " ;
String  = " sr_jlnk_syain js   " ;
String  = " WHERE  rk.sya_id   " ;
String  = "      = js.sya_id   " ;
String  = " AND js.par_id =    " ;
String WK-PAR-ID = null ;
String  = ")" ;
String  = " ORDER BY 1,6,7,hatdate," ;
String  = "8,9,2,11,3,rk.prc_date " ;
String  = "UPDATE              " ;
String  = " sr_jlnktrn_rk rk SET " ;
String  = " syori_flg = 9,     " ;
String  = " act_lnk_date = " ;
String  = " to_date(rtrim('" ;
String ACT-LNK-TIME = null ;
String  = "'), " ;
String  = "'YYYY/MM/DD HH24:MI:SS')," ;
String  = " prc_date = sysdate " ;
String  = " WHERE rk.srtbl_no =" ;
String SYORI-UPD-TBL-NO = null ;
String  = " AND ((rk.syori_flg = 0 " ;
String PAST-UPD-JK-PAR = null ;
String FUTURE-UPD-JK-PAR = null ;
String  = " ) OR (rk.syori_flg = 1))" ;
String SYORI-JK-PAR = null ;
String  = " AND EXISTS(        " ;
String  = " SELECT 1 FROM      " ;
String  = " sr_jlnk_syain js   " ;
String  = " WHERE  rk.sya_id   " ;
String  = "      = js.sya_id   " ;
String  = " AND js.par_id =    " ;
String WK-PAR-ID2 = null ;
String  = ")" ;
String  = " AND ((EXISTS(      " ;
String  = " SELECT 1 FROM      " ;
String  = " sr_hrinfo " ;
String  = " WHERE  rk.sya_id   " ;
String  = "  = sya_id          " ;
String  = " AND rk.hr_no = hr_no " ;
String  = " AND rk.hrrk_kb = hrrk_kb " ;
String  = " AND hatdate >=     " ;
String  = "  (  to_date(rtrim('" ;
String COMPARE-PAST-TIME = null ;
String  = "'), " ;
String  = "'YYYY/MM/DD HH24:MI:SS') - " ;
String JK-PAST-SUSPEND-DAYS = null ;
String  = "))) or " ;
String  = "(rk.trn_kb >=2 AND " ;
String  = " rk.trn_kb <=6))" ;
String  = " AND EXISTS(        " ;
String  = " SELECT 1 FROM      " ;
String  = " sr_hrinfo " ;
String  = " WHERE  rk.sya_id   " ;
String  = "  = sya_id          " ;
String  = " AND rk.hr_no = hr_no " ;
String  = " AND rk.hrrk_kb = hrrk_kb " ;
String  = " AND hatdate <=     " ;
String  = "  (  to_date(rtrim('" ;
String COMPARE-FUTURE-TIME = null ;
String  = "'), " ;
String  = "'YYYY/MM/DD HH24:MI:SS') + " ;
String JK-FUTURE-SUSPEND-DAYS = null ;
String  = "))" ;
String  = "UPDATE              " ;
String  = " sr_jlnktrn_rk rk SET " ;
String  = " restore_flg = -1,  " ;
String  = " prc_date = sysdate " ;
String  = " WHERE rk.srtbl_no =" ;
String RESTORE-UPD-TBL-NO = null ;
String  = " AND rk.syori_flg = 9 " ;
String  = " AND rk.restore_flg=0 " ;
String  = " AND EXISTS(        " ;
String  = " SELECT 1 FROM      " ;
String  = " sr_jlnkhr_no jh    " ;
String  = " WHERE  jh.sya_id   " ;
String  = "      = rk.sya_id   " ;
String  = " AND    jh.hr_no    " ;
String  = "      = rk.hr_no    " ;
String  = " AND    jh.hrrk_kb  " ;
String  = "      = rk.hrrk_kb  " ;
String  = " AND jh.status = 3) " ;
String  = " AND EXISTS(        " ;
String  = " SELECT 1 FROM      " ;
String  = " sr_jlnktrn_rk rk2  " ;
String  = " WHERE  rk2.srtbl_no" ;
String  = "      = rk.srtbl_no " ;
String  = " AND rk2.syori_flg=1" ;
String  = " AND rk2.trn_kb = 9 " ;
String  = " AND    rk2.sya_id  " ;
String  = "      = rk.sya_id   " ;
String  = " AND    rk2.hr_no   " ;
String  = "      = rk.hr_no    " ;
String  = " AND    rk2.status  " ;
String  = "      = rk.status)  " ;
String RESTORE-JK-PAR = null ;
String SLP-TIME = "20" ;
String  = "00" ;

 DISPLAY-TIME()  ;

System.out.println( "***" ) ;

System.out.println( "*** PROGRAM START !!=> " + C-PGMID  + " " + DATE-NOW-TXT  ) ;

System.out.println( "*** PROGRAM VERSION => " + UPDATE_sr_jlnk_rk.getC-VERSION()  ) ;

System.out.println( "***" ) ;

 INIT()  ;

 MAIN()  ;

 FINI()  ;

 DISPLAY-TIME()  ;

System.out.println( "***" ) ;

System.out.println( "*** PROGRAM END !!  => " + C-PGMID  + " " + DATE-NOW-TXT  ) ;

System.out.println( "***" ) ;



System.out.println( "================ INIT END   ================ " + TIME-NOW-TXT  ) ;



DaoClass.UPDATE_sr_jlnk_rk(); 
;

if ( ( DELETE_FROM.getPAR-ID() > 0 ) )  
{
	 #beginstatement 
DaoClass.INSERT_INTO(); 
	;

DaoClass.COMMIT(); 
;



SRJLNKCTRL-REC ;

DaoClass.SELECT_past_lnk_kb(); 
;

DaoClass.SELECT_VAL(); 
;



 DISPLAY-TIME()  ;

System.out.println( "================ MAIN START ================ " + TIME-NOW-TXT  ) ;

if ( ( SIM-KB == 1 ) && ( SELECT_VAL.getUSE-SIM() == 0 ) )  
{
	 #beginstatement 
	System.out.println( "*** �?�実行モード�?��?��??処�?�終了 ***" ) ;

 SRLNKTRN-DEL()  ;

PAST-JK-PAR FUTURE-JK-PAR SYORI-JK-PAR RESTORE-JK-PAR  SPACE;

DaoClass.SELECT_to_char(); 
;

if ( ( SELECT_past_lnk_kb.getPAST-LNK-KB()  <>  0 ) )  
{
	 #beginstatement 
	JK-SELECT_past_lnk_kb.getPAST-SUSPEND-DAYS()  SELECT_past_lnk_kb.getPAST-SUSPEND-DAYS();

	COMPARE-PAST-TIME  SELECT_to_char.getWK-PRC-DATE();

	PAST-JK-PAR  PAST-JK-SQL;

	PAST-UPD-JK-PAR  PAST-JK-SQL;

if ( ( SELECT_past_lnk_kb.getFUTURE-LNK-KB()  <>  0 ) )  
{
	 #beginstatement 
	JK-SELECT_past_lnk_kb.getFUTURE-SUSPEND-DAYS()  SELECT_past_lnk_kb.getFUTURE-SUSPEND-DAYS();

	COMPARE-FUTURE-TIME  SELECT_to_char.getWK-PRC-DATE();

	FUTURE-JK-PAR  FUTURE-JK-SQL;

	FUTURE-UPD-JK-PAR  FUTURE-JK-SQL;

if ( ( DELETE_FROM.getPAR-ID() > 0 ) )  
{
	 #beginstatement 
	SYORI-JK-PAR RESTORE-JK-PAR  PAR-JK-SQL;

if ( ( SELECT_past_lnk_kb.getPAST-LNK-KB() == 0 ) )  
{
	 #beginstatement 
	WK-PAST-DATE  "1900/01/01 00:00:00";

if ( ( SELECT_past_lnk_kb.getFUTURE-LNK-KB() == 0 ) )  
{
	 #beginstatement 
	WK-FUTURE-DATE  "2382/12/31 23:59:59";

PREPARE_srjlnktrncsr_S1.getSQL-PAR()  TRN-SQL;

System.out.println( " ---TRN-SQL--- " + PREPARE_srjlnktrncsr_S1.getSQL-PAR()  ) ;

DaoClass.PREPARE_srjlnktrncsr_S1(); 
;

DaoClass.DECLARE_srjlnktrncsr(); 
;

DaoClass.OPEN_srjlnktrncsr(); 
;

DaoClass.DECLARE_restoretrnrkcsr(); 
;

DaoClass.OPEN_restoretrnrkcsr(); 
;

 SRLNKTRN-FET()  ;

if ( ( LNKSYAIN-EOF-FLG == 0 ) )  
{
	 #beginstatement 
	OLD-SYA-ID  FETCH_srjlnktrncsr.getSRT-SYA-ID();

	OLD-LNK-DATE  FETCH_srjlnktrncsr.getSRT-LNK-DATE();

	OLD-HR-NO  FETCH_srjlnktrncsr.getSRT-HR-NO();

	OLD-HRRK-KB  FETCH_srjlnktrncsr.getSRT-HRRK-KB();

	OLD-STATUS  FETCH_srjlnktrncsr.getSRT-STATUS();

	OLD-TRN-KB  FETCH_srjlnktrncsr.getSRT-TRN-KB();

	OLD-LNK-DATE-KB  FETCH_srjlnktrncsr.getSRT-LNK-DATE()-KB;

	 DISPLAY-TIME()  ;

	System.out.println( " >> メインループ START << " + TIME-NOW-TXT  ) ;

	while ( ! ( ( ( LNKSYAIN-EOF-FLG == 1 ) )  ) )
	{ 
		 #beginstatement 
		 SRLNKTRN-SET()  ;

		 SRMST-WRITE()  ;

		if ( ( TRN-KB < 9 ) )  
		{
			 #beginstatement 
			 TRNRK-OLD-UPD-SET()  ;

		WS-SRLNKTRN-REC ;

		 DATA-ADJUST-KENM()  ;
		 #endstatement   ) ;
	};

	 DISPLAY-TIME()  ;

	System.out.println( " >> メインループ END   << " + TIME-NOW-TXT  ) ;

	if ( ( CNT-DBHR > 0 ) )  
	{
		 #beginstatement 
		 DBHR-UPD()  ;

DaoClass.CLOSE_srjlnktrncsr(); 
;

DaoClass.CLOSE_restoretrnrkcsr(); 
;

if ( ( CNT-DBTRNRK > 0 ) )  
{
	 #beginstatement 
	 DBTRNRK-UPD()  ;

 DISPLAY-TIME()  ;

System.out.println( "================ MAIN END   ================ " + TIME-NOW-TXT  ) ;



 DISPLAY-TIME()  ;

System.out.println( " >> SRLNKTRN-DEL START << " + TIME-NOW-TXT  ) ;

DaoClass.DELETE_FROM(); 
;

 DISPLAY-TIME()  ;

System.out.println( "  > SRLNKTRN-DEL ・・・<  " + TIME-NOW-TXT  ) ;

DaoClass.DELETE_FROM(); 
;

 DISPLAY-TIME()  ;

System.out.println( " >> SRLNKTRN-DEL END   << " + TIME-NOW-TXT  ) ;



SRLNKTRN-REC ;

if ( ( RESTORE-EOF-FLG == 0 ) )  
{
	 #beginstatement 
DaoClass.FETCH_restoretrnrkcsr(); 
	;

	if ( ( SQLCODE  <>  0 ) )  
	{
		 #beginstatement 
		RESTORE-EOF-FLG  1;

if ( ( RESTORE-EOF-FLG == 1 ) )  
{
	 #beginstatement 
	if ( ( CNT-KIHON-HR > 0 ) )  
	{
		 #beginstatement 
		 KIHON-HR-UPD()  ;

DaoClass.FETCH_srjlnktrncsr(); 
	;

	if ( ( SQLCODE  <>  0 ) )  
	{
		 #beginstatement 
		FETCH_srjlnktrncsr.getSRT-SYA-ID()  9999999999;

		LNKSYAIN-EOF-FLG  1;

;

if ( ( WK-TRN-CNT == 2000 ) )  
{
	 #beginstatement 
	 DISPLAY-TIME()  ;

	System.out.println( "    … 処�?�中 …          " + TIME-NOW-TXT  ) ;

	WK-TRN-CNT  0;

if ( ( FETCH_srjlnktrncsr.getSRT-TRN-KB() == 9 ) )  
{
	 #beginstatement 
	KIHON-HR-PTR  CNT-KIHON-HR;

	while ( ! ( ( ( ( ( KIHON-HR-PTR == 0 ) ) || FETCH_srjlnktrncsr.getSRT-SYA-ID()  <>  KIHON-HR-SYA-ID ) )  ) )
	{ 
		 #beginstatement 
		if ( ( ( ( FETCH_srjlnktrncsr.getSRT-SYA-ID() == KIHON-HR-SYA-ID ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-HR-NO() == KIHON-HR-HR-NO ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-HRRK-KB() == KIHON-HR-HRRK-KB ) ) ) )  
		{
		 
		}
		 ;

		;
		 #endstatement   ) ;
	};

	if ( ( ( ( CNT-KIHON-HR >= KIHON-HR-MAX ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-SYA-ID()  <>  KIHON-HR-SYA-ID ) ) ) )  
	{
		 #beginstatement 
		 KIHON-HR-UPD()  ;

	;

	KIHON-HR-SYA-ID  FETCH_srjlnktrncsr.getSRT-SYA-ID();

	KIHON-HR-HR-NO  FETCH_srjlnktrncsr.getSRT-HR-NO();

	KIHON-HR-HRRK-KB  FETCH_srjlnktrncsr.getSRT-HRRK-KB();

		DBHR-PTR  CNT-DBHR;

		while ( ! ( ( ( ( ( DBHR-PTR == 0 ) ) || FETCH_srjlnktrncsr.getSRT-SYA-ID()  <>  DB-HR-SYA-ID ) )  ) )
		{ 
			 #beginstatement 
			if ( ( ( ( FETCH_srjlnktrncsr.getSRT-SYA-ID() == DB-HR-SYA-ID ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-HR-NO() == DB-HR-HR-NO ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-HRRK-KB() == DB-HR-HRRK-KB ) ) ) )  
			{
			 
			}
			 ;

			;
			 #endstatement   ) ;
		};

		if ( ( ( ( CNT-DBHR >= DBHR-MAX ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-SYA-ID()  <>  DB-HR-SYA-ID ) ) ) )  
		{
			 #beginstatement 
			 DBHR-UPD()  ;

		;

		DB-HR-SYA-ID  FETCH_srjlnktrncsr.getSRT-SYA-ID();

		DB-HR-HR-NO  FETCH_srjlnktrncsr.getSRT-HR-NO();

		DB-HR-HRRK-KB  FETCH_srjlnktrncsr.getSRT-HRRK-KB();



if ( ( ( ( FETCH_srjlnktrncsr.getSRT-SYA-ID() == OLD-SYA-ID ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-LNK-DATE() == OLD-LNK-DATE ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-STATUS() == OLD-STATUS ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-HR-NO() == OLD-HR-NO ) ) ) && ( ( ( FETCH_srjlnktrncsr.getSRT-HRRK-KB() == OLD-HRRK-KB ) ) ) && ( ( ( ( ( ( ( FETCH_srjlnktrncsr.getSRT-TRN-KB() < 9 ) ) ) && ( ( ( OLD-TRN-KB < 9 ) ) ) ) || ( ( ( ( FETCH_srjlnktrncsr.getSRT-TRN-KB() == 9 ) ) ) && ( ( ( OLD-TRN-KB == 9 ) ) ) ) ) ) ) )  
{
	 #beginstatement 
	if ( ( ( ( CNT-LNKTRN == 0 ) ) || ( ( ( ( FETCH_srjlnktrncsr.getSRT-SRTBL-NO()  <>  WS-SRTBL-NO ) ) || ( ( FETCH_srjlnktrncsr.getSRT-SRFLD-ID()  <>  WS-SRFLD-ID ) ) || ( ( FETCH_srjlnktrncsr.getSRT-KNM-SEQ()  <>  WS-KNM-SEQ ) ) ) ) ) )  
	{
		 #beginstatement 
		;

	WS-SRTBL-NO  FETCH_srjlnktrncsr.getSRT-SRTBL-NO();

	WS-SRFLD-ID  FETCH_srjlnktrncsr.getSRT-SRFLD-ID();

	WS-SRFLD-OVAL WS-SRFLD-OVAL-J  FETCH_srjlnktrncsr.getSRT-SRFLD-OVAL();

	WS-SRFLD-NVAL WS-SRFLD-NVAL-J  FETCH_srjlnktrncsr.getSRT-SRFLD-NVAL();

	WS-TRN-KB  FETCH_srjlnktrncsr.getSRT-TRN-KB();

	WS-KNM-SEQ  FETCH_srjlnktrncsr.getSRT-KNM-SEQ();

	WS-LNK-DATE  FETCH_srjlnktrncsr.getSRT-LNK-DATE();

	WS-HR-NO  FETCH_srjlnktrncsr.getSRT-HR-NO();

	WS-HRRK-KB  FETCH_srjlnktrncsr.getSRT-HRRK-KB();

	WS-STATUS  FETCH_srjlnktrncsr.getSRT-STATUS();

	WS-ENTRY-KB  FETCH_srjlnktrncsr.getSRT-ENTRY-KB();

	WS-SYORI-FLG  0;

	 SRLNKTRN-FET()  ;

	LNK-DATE  OLD-LNK-DATE;

	HR-NO  OLD-HR-NO;

	HRRK-KB  OLD-HRRK-KB;

	WK-STATUS  OLD-STATUS;

	TRN-KB  OLD-TRN-KB;

	LNK-DATE-KB  OLD-LNK-DATE-KB;
	 #endstatement   } ;

OLD-SYA-ID  FETCH_srjlnktrncsr.getSRT-SYA-ID();

OLD-LNK-DATE  FETCH_srjlnktrncsr.getSRT-LNK-DATE();

OLD-HR-NO  FETCH_srjlnktrncsr.getSRT-HR-NO();

OLD-HRRK-KB  FETCH_srjlnktrncsr.getSRT-HRRK-KB();

OLD-STATUS  FETCH_srjlnktrncsr.getSRT-STATUS();

OLD-TRN-KB  FETCH_srjlnktrncsr.getSRT-TRN-KB();

OLD-LNK-DATE-KB  FETCH_srjlnktrncsr.getSRT-LNK-DATE()-KB;



 SRMST-GET()  ;

 SRKNM-GET()  ;

CP-SRMST-REC ;

if ( ( CNT-SRMST == 0 ) )  
{
	 #beginstatement 
	SRM-IDX  1;

	KNM-IDX  0;

	CNT-SRMST  1;

	LNK-EDATE  "2382/12/31";

	KNM-IDX  1;

	 SRMST-NEW()  ;

	while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
	{ 
		 #beginstatement 
		 SRKNM-NEW()  ;

		;
		 #endstatement   ) ;
	};

SRM-PTR  1;

while ( ! ( ( ( SRM-PTR > CNT-SRMST ) )  ) )
{ 
	 #beginstatement 
	if ( ( ( ( ( ( TRN-KB < 9 ) ) ) && ( ( ( SRM-EDATE >= LNK-DATE ) ) ) ) || ( ( SRM-SDATE == LNK-DATE ) ) ) )  
	{
		 #beginstatement 
		CP-SRMST-REC  SRMST;

		 break(); ;

	;
	 #endstatement   ) ;
};

if ( ( SRM-STATUS == 0 || TRN-KB == 9 ) )  
{
	 #beginstatement 
	IS-STS0-FLG  1;

	while ( ! ( ( ( IX6 > CNT-SRKNM ) )  ) )
	{ 
		 #beginstatement 
		SRK-IS-STS0-FLG  1;

		;
		 #endstatement   ) ;
	};
	 #endstatement   } ;

if ( ( TRN-KB < 9 ) )  
{
	 #beginstatement 
	;

	while ( ! ( ( ( SRM-PTR2 > CNT-SRMST || SRM-SDATE > LNK-DATE ) )  ) )
	{ 
		 #beginstatement 
		;
		 #endstatement   ) ;
	};

	;

	if ( ( SRM-PTR < SRM-PTR2 ) )  
	{
		 #beginstatement 
		IX6  1;

		while ( ! ( ( ( IX6 > CNT-SRKNM ) )  ) )
		{ 
			 #beginstatement 
			IX7  1;

			while ( ! ( ( ( IX7 > CNT-SRKNM ) )  ) )
			{ 
				 #beginstatement 
				if ( ( SRK-KNM-SEQ == SRK-KNM-SEQ ) )  
				{
					 #beginstatement 
					 break(); ;

				;
				 #endstatement   ) ;
			};

			if ( ( IX7 > CNT-SRKNM ) )  
			{
				 #beginstatement 
				;

				SRKNM  SRKNM;

				SRK-IS-STS0-FLG  1;

			;
			 #endstatement   ) ;
		};

		CP-SRMST-REC  SRMST;

SRM-EQUAL-DATE  0;

if ( ( SRM-SDATE > LNK-DATE ) )  
{
	 #beginstatement 
	IX4  CNT-SRMST;

	while ( ! ( ( ( IX4 < 1 ) )  ) )
	{ 
		 #beginstatement 
		;

		SRMST  SRMST;

		;
		 #endstatement   ) ;
	};

	;

	SRMST ;

	CP-SRMST-REC  SRMST;

	SRM-IDX KNM-IDX  1;

	 SRMST-SET-VALUE()  ;

	WK-ADD-DAYS  1;

	WK-DATE  SRM-SDATE;

	 ADD-XDAYS()  ;

	LNK-EDATE  WK-DATE;

	 SRMST-NEW()  ;

	 SRKNM-NEW()  ;

	SRM-PTR  2;

SRM-IDX  SRM-PTR;

while ( ! ( ( ( SRM-IDX > CNT-SRMST ) )  ) )
{ 
	 #beginstatement 
	KNM-IDX  0;

	while ( ! ( ( ( KNM-IDX >= CNT-SRKNM ) )  ) )
	{ 
		 #beginstatement 
		;

		WK-IDX  SRM-IDX;

		while ( ! ( ( ( WK-IDX <= 0 ) )  ) )
		{ 
			 #beginstatement 
			if ( ( SRM-SDATE < SRM-SDATE ) && ( SRM-STATUS == 0 ) )  
			{
				 #beginstatement 
				 break(); ;

			;
			 #endstatement   ) ;
		};

		if ( ( SRM-SDATE == LNK-DATE ) )  
		{
			 #beginstatement 
			SRM-EQUAL-DATE  1;

			;

			if ( ( ( ( WK-IDX2 <= CNT-SRMST ) ) ) && ( ( ( WK-STATUS == 1 ) ) ) )  
			{
				 #beginstatement 
				if ( ( SRM-SDATE == SRM-SDATE ) )  
				{
					 #beginstatement 
					CP-SRMST-REC  SRMST;

					 break(); ;

		if ( ( ( ( WK-STATUS == 1 ) ) ) && ( ( ( SRM-STATUS == 0 ) ) ) && ( ( ( SRM-SDATE < LNK-DATE ) ) ) )  
		{
			 #beginstatement 
			;

			while ( ! ( ( ( WK-IDX2 > CNT-SRMST ) )  ) )
			{ 
				 #beginstatement 
				if ( ( ( ( SRM-STATUS == 1 ) ) ) && ( ( ( SRM-SDATE == LNK-DATE ) ) ) )  
				{
					 #beginstatement 
					CP-SRMST-REC  SRMST;

					 break(); ;

				;
				 #endstatement   ) ;
			};

			if ( ( WK-IDX2 <= CNT-SRMST ) )  
			{
				 #beginstatement 
				 break(); ;

		if ( ( ( ( WK-STATUS == 1 ) ) ) && ( ( ( SRM-STATUS == 1 ) ) ) && ( ( ( SRM-SDATE  <>  LNK-DATE ) ) ) )  
		{
			 #beginstatement 
			 break(); ;

		;

		while ( ! ( ( ( WK-IDX2 <= 0 ) )  ) )
		{ 
			 #beginstatement 
			if ( ( SRM-STATUS == 0 ) )  
			{
				 #beginstatement 
				 break(); ;

			;
			 #endstatement   ) ;
		};

		if ( ( ( ( SRM-SDATE < LNK-DATE ) ) ) && ( ( ( SRM-IDX > SRM-PTR ) ) ) && ( ( ( WK-STATUS == 1 ) ) ) )  
		{
			 #beginstatement 
			CP-SRMST-REC  SRMST;

		if ( ( ( ( WK-STATUS == 1 ) ) ) && ( ( ( SRM-SDATE > LNK-DATE ) ) ) && ( ( ( IS-STS0-FLG == 1 ) ) ) )  
		{
			 #beginstatement 
			 break(); ;

		SAME-DATA-FLG  0;

		if ( ( TRN-KB < 9 ) )  
		{
			 #beginstatement 
			 SRMST-SET-VALUE()  ;

			if ( ( ( ( CNT-SRKNM == KNM-IDX || CNT-SRKNM == 0 ) ) ) && ( WK-IDX2 > 0 ) && ( SRM-STATUS == 1 ) )  
			{
				 #beginstatement 
				SRMST-COMPARE-REC ;

				SRMST-COMPARE  SRMST;

				SRMST-COMPARE  SRMST;

				while ( ! ( IX ) )
				{ 
					 #beginstatement 
					COM-SRK-STATUS COM-SRK-STATUS COM-SRK-INSERT-FLG COM-SRK-INSERT-FLG COM-INSERT-FLG COM-INSERT-FLG COM-IS-STS0-FLG COM-IS-STS0-FLG  0;
					 #endstatement   ) ;
				};

				if ( ( COM-SONOTA == COM-SONOTA ) )  
				{
					 #beginstatement 
					 SRMST-MERGE()  ;

				 SRMST-SET-DEL()  ;

				if ( ( CNT-SRKNM >= KNM-IDX ) && ( SRK-K-SR-SYZ-CD == SPACE ) && ( SRK-K-GENERAL-CD01 == SPACE ) && ( SRK-K-GENERAL-CD02 == SPACE ) && ( SRK-K-GENERAL-CD03 == SPACE ) && ( SRK-K-GENERAL-CD04 == SPACE ) && ( SRK-K-GENERAL-CD05 == SPACE ) && ( SRK-K-GENERAL-CD06 == SPACE ) && ( SRK-K-GENERAL-CD07 == SPACE ) && ( SRK-K-GENERAL-CD08 == SPACE ) && ( SRK-K-GENERAL-CD09 == SPACE ) && ( SRK-K-GENERAL-CD10 == SPACE ) && ( ( ( ( ( SRM-STATUS == WK-STATUS ) ) || ( ( WK-STATUS == 0 ) ) ) ) ) )  
				{
					 #beginstatement 
					TGT-STATUS  SRM-STATUS;

					 SRKNM-DEL()  ;

					IX8  KNM-IDX;

					while ( ! ( ( ( IX8 == CNT-SRKNM ) )  ) )
					{ 
						 #beginstatement 
						;

						SRKNM  SRKNM;

						CSRKNM  CSRKNM;

						;
						 #endstatement   ) ;
					};

					SRKNM ;

					;

					;

				if ( ( ( ( CNT-SRKNM == KNM-IDX || CNT-SRKNM == 0 ) ) ) && ( WK-IDX2 > 0 ) )  
				{
					 #beginstatement 
					SRMST-COMPARE-REC ;

					SRMST-COMPARE  SRMST;

					SRMST-COMPARE  SRMST;

					while ( ! ( IX ) )
					{ 
						 #beginstatement 
						COM-SRK-STATUS COM-SRK-STATUS COM-SRK-INSERT-FLG COM-SRK-INSERT-FLG COM-INSERT-FLG COM-INSERT-FLG COM-IS-STS0-FLG COM-IS-STS0-FLG  0;
						 #endstatement   ) ;
					};

					if ( ( COM-SONOTA == COM-SONOTA ) )  
					{
						 #beginstatement 
						 SRMST-MERGE()  ;

	SRMST-COMPARE-REC ;

	SRMST-COMPARE  CP-SRMST-REC;

	SRMST-COMPARE  SRMST;

	while ( ! ( IX ) )
	{ 
		 #beginstatement 
		COM-SRK-STATUS COM-SRK-STATUS COM-SRK-INSERT-FLG COM-SRK-INSERT-FLG COM-INSERT-FLG COM-INSERT-FLG COM-IS-STS0-FLG COM-IS-STS0-FLG  0;
		 #endstatement   ) ;
	};

	if ( ( COM-SONOTA == COM-SONOTA ) )  
	{
		 #beginstatement 
		SAME-DATA-FLG  1;

	if ( ( SAME-DATA-FLG == 0 ) )  
	{
		 #beginstatement 
		if ( ( ( ( SRM-SDATE < LNK-DATE ) ) ) )  
		{
			 #beginstatement 
			if ( ( WK-STATUS == 1 ) )  
			{
				 #beginstatement 
				if ( ( ( ( SRM-IDX >= CNT-SRMST ) ) ) )  
				{
					 #beginstatement 
					if ( ( ( ( SRM-STATUS == 0 ) ) || ( ( IS-STS0-FLG == 0 ) ) ) )  
					{
						 #beginstatement 
						 SRMST-INS()  ;

					KNM-IDX  1;

					while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
					{ 
						 #beginstatement 
						if ( ( ( ( SRK-STATUS == 0 ) ) || ( ( SRK-IS-STS0-FLG == 1 ) ) ) )  
						{
							 #beginstatement 
							 SRKNM-INS()  ;

						;
						 #endstatement   ) ;
					};

						if ( ( SRM-SDATE == LNK-DATE ) )  
						{
							 #beginstatement 
							 break(); ;

					if ( ( WK-SRM-IDX > CNT-SRMST ) )  
					{
						 #beginstatement 
						if ( ( ( ( SRM-STATUS == 0 ) ) || ( ( IS-STS0-FLG == 0 ) ) ) )  
						{
							 #beginstatement 
							 SRMST-INS()  ;

						KNM-IDX  1;

						while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
						{ 
							 #beginstatement 
							if ( ( ( ( SRK-STATUS == 0 ) ) || ( ( SRK-IS-STS0-FLG == 1 ) ) ) )  
							{
								 #beginstatement 
								 SRKNM-INS()  ;

							;
							 #endstatement   ) ;
						};

					 SRMST-INS()  ;

					KNM-IDX  1;

					while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
					{ 
						 #beginstatement 
						 SRKNM-INS()  ;

						;
						 #endstatement   ) ;
					};

						 SRMST-INS()  ;

						IS-STS0-FLG  1;

					KNM-IDX  1;

					while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
					{ 
						 #beginstatement 
						if ( ( ( ( SRK-IS-STS0-FLG == 1 ) ) ) )  
						{
							 #beginstatement 
							 SRKNM-INS()  ;

							SRK-IS-STS0-FLG  0;

						;
						 #endstatement   ) ;
					};
					 #endstatement   } ;
				 #endstatement   } ;

				if ( ( WK-STATUS == 1 ) )  
				{
					 #beginstatement 
					if ( ( SRM-STATUS == 0 ) )  
					{
						 #beginstatement 
						if ( ( ( ( SRM-IDX >= CNT-SRMST ) ) || ( ( SRM-SDATE > LNK-DATE ) ) ) )  
						{
							 #beginstatement 
							 SRMST-INS()  ;

							KNM-IDX  1;

							while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
							{ 
								 #beginstatement 
								 SRKNM-INS()  ;

								;
								 #endstatement   ) ;
							};

						 SRMST-UPD()  ;

						KNM-IDX  1;

						while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
						{ 
							 #beginstatement 
							 SRKNM-UPD()  ;

							;
							 #endstatement   ) ;
						};
						 #endstatement   } ;

						TGT-STATUS  SRM-STATUS;

						 SRMST-UPD()  ;

						KNM-IDX  1;

						while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
						{ 
							 #beginstatement 
							 SRKNM-UPD()  ;

							;
							 #endstatement   ) ;
						};

							 SRMST-INS()  ;

							IS-STS0-FLG  1;

						KNM-IDX  1;

						while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
						{ 
							 #beginstatement 
							if ( ( ( ( SRK-IS-STS0-FLG == 1 ) ) ) )  
							{
								 #beginstatement 
								 SRKNM-INS()  ;

								SRK-IS-STS0-FLG  0;

							;
							 #endstatement   ) ;
						};

						TGT-STATUS  SRM-STATUS;

						 SRMST-UPD()  ;

						KNM-IDX  1;

						while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
						{ 
							 #beginstatement 
							 SRKNM-UPD()  ;

							;
							 #endstatement   ) ;
						};
						 #endstatement   } ;
					 #endstatement   } ;

					TGT-STATUS  SRM-STATUS;

					 SRMST-UPD()  ;

					KNM-IDX  1;

					while ( ! ( ( ( KNM-IDX > CNT-SRKNM ) )  ) )
					{ 
						 #beginstatement 
						 SRKNM-UPD()  ;

						;
						 #endstatement   ) ;
					};

	;
	 #endstatement   ) ;
};



 }
