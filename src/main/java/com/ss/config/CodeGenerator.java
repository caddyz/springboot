package com.ss.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 小混蛋
 */
public class CodeGenerator {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "123456";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String AUTHOR = "Kaiser";
    //生成的文件输出到哪个目录
    public static final String OUTPUT_FILE = "D:\\codeGen";
    //包名，会按照com/example/demo这种形式生成类
    public static final String PACKAGE = "com.ss.pojo";
    //TODO 更多配置请参考http://mp.baomidou.com/#/generate-code

    public void generateByTables(boolean serviceNameStartWithI, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(DB_URL)
                .setUsername(USER_NAME)
                .setPassword(PASSWORD)
                .setDriverName(DRIVER);
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true) //全局大写命名
                .setEntityLombokModel(false) //是否为lombok模型 
                .setControllerMappingHyphenStyle(true)
                .setRestControllerStyle(true)
                .setNaming(NamingStrategy.underline_to_camel)//表名生成策略  
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor(AUTHOR)
                .setOutputDir(OUTPUT_FILE) //设置文件路径
                .setFileOverride(true) //是否重写文件
                .setOpen(false); //是否打开文件
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(PACKAGE)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }
}
