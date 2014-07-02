 import java.sql.*; 
 
 
public class DaoClass { 
 
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver" ; 
static final String DB_URL = localhost; 
static final String USER = ; 
static final String PASS = ; 
Connection conn = null; 
Statement stmt = null; 

 
DaoClass() { 
 try{ 
 
	//STEP 2: Register JDBC driver 
	Class.forName("com.mysql.jdbc.Driver"); 
	//STEP 3: Open a connection 
	System.out.println("Connecting to database..."); 
	conn = DriverManager.getConnection(localhost); 
 } 
 } 

 
public static void UPDATE_sr_jlnk_rk() { 
 
String sql; 
 
sql = "UPDATE  sr_jlnk_rk  SET  VER_002  =  ? ,  WHERE   seq_no  =   (   SELECT  max  (   seq_no  )   FROM   sr_jlnk_rk  )   AND   par_id  =   0  AND   status  =   2  AND   ver_002  is  null";
 
 stmt = conn.prepareCall(); 
 stmt.setString(1,C-VERSION) 
 stmt.execute() ;  
} 

 
public static void INSERT_INTO() { 
 
String sql; 
 
sql = "	 INSERT  	 INTO 	 SR_JLNK_RK 	 (  	 SEQ_NO 	 ,  	 PAR_ID 	 ,  	 LNKTBL_NO 	 ,  	 ACT_KB 	 ,  	 STIME 	 ,  	 STATUS 	 ,  	 LAST_TIME 	 ,  	 LAST_LNK_TIME 	 ,  	 START_DATE 	 ,  	 END_DATE 	 ,  	 LNK_KB 	 ,  	 LNKFLG01 	 ,  	 LNKFLG02 	 ,  	 LNKFLG03 	 ,  	 LNKFLG04 	 ,  	 LNKFLG05 	 ,  	 LNKFLG06 	 ,  	 LNKFLG07 	 ,  	 LNKFLG08 	 ,  	 LNKFLG09 	 ,  	 LNKFLG10 	 ,  	 PAST_LNK_KB 	 ,  	 FUTURE_LNK_KB 	 ,  	 PAST_SUSPEND_DAYS 	 ,  	 FUTURE_SUSPEND_DAYS 	 ,  	 VER_001 	 ,  	 VER_002 	 ,  	 VER_003 	 )  	 SELECT 	 SEQ_NO 	 ,  ? , 	 LNKTBL_NO 	 ,  	 ACT_KB 	 ,  	 sysdate 	 ,  	 STATUS 	 ,  	 LAST_TIME 	 ,  	 LAST_LNK_TIME 	 ,  	 START_DATE 	 ,  	 END_DATE 	 ,  	 LNK_KB 	 ,  	 LNKFLG01 	 ,  	 LNKFLG02 	 ,  	 LNKFLG03 	 ,  	 LNKFLG04 	 ,  	 LNKFLG05 	 ,  	 LNKFLG06 	 ,  	 LNKFLG07 	 ,  	 LNKFLG08 	 ,  	 LNKFLG09 	 ,  	 LNKFLG10 	 ,  	 PAST_LNK_KB 	 ,  	 FUTURE_LNK_KB 	 ,  	 PAST_SUSPEND_DAYS 	 ,  	 FUTURE_SUSPEND_DAYS 	 ,  	 VER_001 	 ,  	 VER_002 	 ,  	 VER_003 	 FROM  	 sr_jlnk_rk 	 WHERE  	 seq_no 	 =  	 (  	 SELECT 	 max 	 (  	 seq_no 	 )  	 FROM  	 sr_jlnk_rk 	 )  	 AND  	 par_id 	 =  	 0 	 AND  	 status 	 =  	 2";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,PAR-ID) 
 stmt.execute() ;  
} 

 
public static void COMMIT() { 
 
String sql; 
 
sql = "COMMIT";
 
 stmt = conn.prepareCall(); 
  stmt.execute() ;  
} 

 
public static void SELECT_past_lnk_kb() { 
 
String sql; 
 
sql = "SELECT  past_lnk_kb  ,   future_lnk_kb  ,   past_suspend_days  ,   future_suspend_days  ,   lnkflg06  INTO ? , ? , ? , ? , ? ,  FROM   sr_jlnkctrl  WHERE   lnktbl_no  =   90000";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,PAST-LNK-KB) 
stmt.setdouble(2,FUTURE-LNK-KB) 
stmt.setdouble(3,PAST-SUSPEND-DAYS) 
stmt.setdouble(4,FUTURE-SUSPEND-DAYS) 
stmt.setdouble(5,LNK-RESTORE) 
 stmt.execute() ;  
} 

 
public static void SELECT_VAL() { 
 
String sql; 
 
sql = "SELECT  VAL  INTO ? ,  FROM   SR_JLNK_INFO_FLG  WHERE   NAME  =   '   use_sim  ' ";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,USE-SIM) 
 stmt.execute() ;  
} 

 
public static void SELECT_to_char() { 
 
String sql; 
 
sql = "SELECT  to_char  (   sysdate  ,   '   YYYY  /   MM  /   DD  HH24:MI:SS  '   )   INTO ? ,  FROM   DUAL";
 
 stmt = conn.prepareCall(); 
 stmt.setString(1,WK-PRC-DATE) 
 stmt.execute() ;  
} 

 
public static void PREPARE_srjlnktrncsr_S1() { 
 
String sql; 
 
sql = "PREPARE  srjlnktrncsr_S1  FROM  ? , ";
 
 stmt = conn.prepareCall(); 
 stmt.setString(1,SQL-PAR) 
 stmt.execute() ;  
} 

 
public static void DECLARE_srjlnktrncsr() { 
 
String sql; 
 
sql = " DECLARE   srjlnktrncsr  CURSOR  FOR  srjlnktrncsr_S1";
 
 stmt = conn.prepareCall(); 
  stmt.execute() ;  
} 

 
public static void OPEN_srjlnktrncsr() { 
 
String sql; 
 
sql = "OPEN  srjlnktrncsr  FOR  READONLY";
 
 stmt = conn.prepareCall(); 
  stmt.execute() ;  
} 

 
public static void DECLARE_restoretrnrkcsr() { 
 
String sql; 
 
sql = " DECLARE   restoretrnrkcsr  CURSOR  FOR  SELECT  sya_id  ,   srtbl_no  ,   srfld_id  ,   srfld_oval  ,   srfld_nval  ,   to_char  (   lnk_date  ,   '   YYYY  /   MM  /   DD  '   )   ,   rk  .  status  ,   hr_no  ,   hrrk_kb  ,   trn_kb  ,   knm_seq  ,   entry_kb  FROM   sr_jlnktrn_rk  rk  WHERE   srtbl_no  <   91000  AND   trn_kb  =   9  AND   syori_flg  =   1  AND   exists  (   SELECT  0  FROM   sr_jlnk_syain  js  WHERE   rk  .  sya_id  =   js  .  sya_id  AND   js  .  par_id  =  ? ,  )   ORDER  BY   1  ,   act_lnk_date  desc  ,   6  desc  ,   7  desc  ,   hatdate  desc  ,   8  desc  ,   9  desc  ,   2  ,   11  ,   3";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,PAR-ID) 
 stmt.execute() ;  
} 

 
public static void OPEN_restoretrnrkcsr() { 
 
String sql; 
 
sql = "OPEN  restoretrnrkcsr  FOR  READONLY";
 
 stmt = conn.prepareCall(); 
  stmt.execute() ;  
} 

 
public static void CLOSE_srjlnktrncsr() { 
 
String sql; 
 
sql = "CLOSE  srjlnktrncsr";
 
 stmt = conn.prepareCall(); 
  stmt.execute() ;  
} 

 
public static void CLOSE_restoretrnrkcsr() { 
 
String sql; 
 
sql = "CLOSE  restoretrnrkcsr";
 
 stmt = conn.prepareCall(); 
  stmt.execute() ;  
} 

 
public static void DELETE_FROM() { 
 
String sql; 
 
sql = "DELETE  FROM   sr_jlnktrn_rk  rk  WHERE   OT  EXISTS  (   SELECT  0  FROM   sr_hrinfo  hi  WHERE   hi  .  hr_no  =   rk  .  hr_no  AND   hi  .  hrrk_kb  =   rk  .  hrrk_kb  AND   hi  .  sya_id  =   rk  .  sya_id  )   AND   rk  .  srtbl_no  <   91000  AND   rk  .  hr_no  >   0  AND   rk  .  syori_flg  <   9  AND   rk  .  restore_flg  =   0  AND   exists  (   SELECT  0  FROM   sr_jlnk_syain  js  WHERE   rk  .  sya_id  =   js  .  sya_id  AND   js  .  par_id  =  ? ,  ) ";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,PAR-ID) 
 stmt.execute() ;  
} 

 
public static void DELETE_FROM() { 
 
String sql; 
 
sql = "DELETE  FROM   sr_jlnktrn_rk  rk  WHERE   trn_kb  =   6  AND   syori_flg  <   9  AND   EXISTS  (   SELECT  0  FROM   sr_jlnk_kmk_setup_rk  kk  WHERE   kk  .  srtbl_no  =   rk  .  srtbl_no  AND   kk  .  srfld_id  =   rk  .  srfld_id  AND   rk  .  lnk_date  between  kk  .  sdate  and  kk  .  edate  AND   kk  .  syori_flg  =   0  )   AND   exists  (   SELECT  0  FROM   sr_jlnk_syain  js  WHERE   rk  .  sya_id  =   js  .  sya_id  AND   js  .  par_id  =  ? ,  ) ";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,PAR-ID) 
 stmt.execute() ;  
} 

 
public static void FETCH_restoretrnrkcsr() { 
 
String sql; 
 
sql = "	FETCH 	 restoretrnrkcsr 	 INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,SRT-SYA-ID) 
stmt.setdouble(2,SRT-SRTBL-NO) 
stmt.setString(3,SRT-SRFLD-ID) 
stmt.setString(4,SRT-SRFLD-OVAL) 
stmt.setString(5,SRT-SRFLD-NVAL) 
stmt.setString(6,SRT-LNK-DATE) 
stmt.setdouble(7,SRT-STATUS) 
stmt.setdouble(8,SRT-HR-NO) 
stmt.setdouble(9,SRT-HRRK-KB) 
stmt.setdouble(10,SRT-TRN-KB) 
stmt.setdouble(11,SRT-KNM-SEQ) 
stmt.setdouble(12,SRT-ENTRY-KB) 
 stmt.execute() ;  
} 

 
public static void FETCH_srjlnktrncsr() { 
 
String sql; 
 
sql = "	FETCH 	 srjlnktrncsr 	 INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ";
 
 stmt = conn.prepareCall(); 
 stmt.setdouble(1,SRT-SYA-ID) 
stmt.setdouble(2,SRT-SRTBL-NO) 
stmt.setString(3,SRT-SRFLD-ID) 
stmt.setString(4,SRT-SRFLD-OVAL) 
stmt.setString(5,SRT-SRFLD-NVAL) 
stmt.setString(6,SRT-LNK-DATE) 
stmt.setdouble(7,SRT-STATUS) 
stmt.setdouble(8,SRT-HR-NO) 
stmt.setdouble(9,SRT-HRRK-KB) 
stmt.setdouble(10,SRT-TRN-KB) 
stmt.setdouble(11,SRT-KNM-SEQ) 
stmt.setdouble(12,SRT-ENTRY-KB) 
stmt.setdouble(13,SRT-LNK-DATE-KB) 
 stmt.execute() ;  
} 

 
 } 