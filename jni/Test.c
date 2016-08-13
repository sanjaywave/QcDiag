#include <jni.h>
#include <stdio.h>
#include <fcntl.h>
#include <signal.h>
#include <unistd.h>
#include <android/log.h>
#include <stdio.h>
#include <dlfcn.h>
#include "InitDaemon.h"



extern void exit();


/*
 * Function to Init DM_Daemon
 * Returns the child ProcessID
 *
 */
int Java_com_wavenet_dmservice_service_DmProcess_initDM(JNIEnv * env, jobject this)
{
	system("su");
	return initDMDaemon();
}




