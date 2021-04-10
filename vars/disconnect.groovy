def call() {
	if (env.IPADDRESS && env.PORT) {
		sh '''
			adb -s ${IPADDRESS}:${PORT} shell "echo temp > /sys/power/wake_unlock"
			adb disconnect ${IPADDRESS}:${PORT}
		'''
	}
}
