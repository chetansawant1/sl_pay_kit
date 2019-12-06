To get a Swipelinc Payment Kit into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.chetansawant1:sl_pay_kit:1.0.3'
	}
	
	
Methods defined by following

	1) sl_pay_cs.slTrnReq();
	2) sl_pay_cs.slMotoTrnReq();
