;SCP - Containment Breach

;    The game is based on the works of the SCP Foundation community (http://www.scp-wiki.net/).

;    The source code is licensed under Creative Commons Attribution-ShareAlike 3.0 License.
;    http://creativecommons.org/licenses/by-sa/3.0/

;    See Credits.txt for a list of contributors

Function CheckForDLLs%()
	Local InitErrorStr$ = ""
	If FileSize("Blitzcord.dll") = 0 Then InitErrorStr = InitErrorStr + "Blitzcord.dll" + Chr(13) + Chr(10)
	If FileSize("BlitzSteamworks.dll") = 0 Then InitErrorStr = InitErrorStr + "BlitzSteamworks.dll" + Chr(13) + Chr(10)
	If FileSize("discord_game_sdk.dll") = 0 Then InitErrorStr = InitErrorStr + "discord_game_sdk.dll" + Chr(13) + Chr(10)
	If FileSize("steam_api.dll") = 0 Then InitErrorStr = InitErrorStr + "steam_api.dll" + Chr(13) + Chr(10)
	
	If Len(InitErrorStr) > 0 Then RuntimeError "The following DLLs were not found in the game directory:" + Chr(13) + Chr(10) + Chr(13) + Chr(10) + InitErrorStr
End Function

CheckForDLLs()

Include "Main.bb"
