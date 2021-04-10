def call() {
	switch (env.MYCI_NODE_TYPE) {
	case "android":
		if (!env.IPADDRESS || !env.PORT) {
			println("ERROR: Missing IPADDRESS and PORT info")
			exit(1)
		}
		break
	default:
		println("ERROR: not an Android node!")
		exit(1)
		break
	}
}
