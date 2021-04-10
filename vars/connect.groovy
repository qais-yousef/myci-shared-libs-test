def call() {
	if (env.IPADDRESS && env.PORT) {
		sh '''
			adb connect ${IPADDRESS}:${PORT}
			adb -s ${IPADDRESS}:${PORT} shell "echo temp > /sys/power/wake_lock"
		'''
	}
}
