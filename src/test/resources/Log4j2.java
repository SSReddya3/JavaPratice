
public class Log4j2 {

	property.filename = logs
			appenders = console, file

			appender.console.type = Console
			appender.console.name = STDOUT
			appender.console.layout.type = PatternLayout
			appender.console.layout.pattern = [%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n

			appender.file.type = File
			appender.file.name = LOGFILE
			appender.file.fileName=${filename}/AppLogs.log
			appender.file.layout.type=PatternLayout
			appender.file.layout.pattern=[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
			appender.file.append = true

			loggers=file
			logger.file.name=Demo
			logger.file.level = ALL
			logger.file.appenderRefs = file
			logger.file.appenderRef.file.ref = LOGFILE
			rootLogger.level = ALL
			rootLogger.appenderRefs = stdout
			rootLogger.appenderRef.stdout.ref = STDOUT
			rootLogger.appenderRef.file.ref = LOGFILE
	
	
	
	
	
	
	
	
	
	
	
	
}
