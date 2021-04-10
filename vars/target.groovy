def connect_android(ip = env.IPADDRESS, port = env.PORT) {
	sh '''
		adb connect ${ip}:${port}
		adb -s ${ip}:${port} shell "echo temp > /sys/power/wake_lock"
	'''
}

def disconnect_android(ip = env.IPADDRESS, port = env.PORT) {
	sh '''
		adb -s ${ip}:${port} shell "echo temp > /sys/power/wake_unlock"
		adb disconnect ${ip}:${port}
	'''
}
