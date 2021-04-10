def connect_android() {
	sh '''
		adb shell connect env.IPADDRESS:env.PORT
		adb shell -s env.IPADDRESS:env.PORT "echo temp > /sys/power/wake_lock"
	'''
}

def disconnect_android() {
	sh '''
		adb shell -s env.IPADDRESS:env.PORT "echo temp > /sys/power/wake_unlock"
		adb shell disconnect env.IPADDRESS:env.PORT
	'''
}
