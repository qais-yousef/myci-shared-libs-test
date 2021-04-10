def connect_android() {
	sh '''
		adb connect ${IPADDRESS}:${PORT}
		adb -s ${IPADDRESS}:${PORT} shell "echo temp > /sys/power/wake_lock"
	'''
}

def disconnect_android() {
	sh '''
		adb -s ${IPADDRESS}:${PORT} shell "echo temp > /sys/power/wake_unlock"
		adb disconnect ${IPADDRESS}:${PORT}
	'''
}
