def call() {
	switch (env.MYCI_NODE_TYPE) {
	case "android":
		if (env.IPADDRESS && env.PORT) {
			sh '''
				adb -s ${IPADDRESS}:${PORT} shell "echo temp > /sys/power/wake_unlock"
				adb disconnect ${IPADDRESS}:${PORT}
			'''
		} else {
			println("ERROR: Missing IPADDRESS and PORT info")
			exit(1)
		}
		break
	default:
		break
	}
}
