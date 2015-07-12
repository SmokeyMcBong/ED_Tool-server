@echo OFF

setlocal ENABLEEXTENSIONS
set KEY_NAME_STEAM="HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Windows\CurrentVersion\Uninstall\Steam App 359320"
set KEY_NAME_RETAIL="HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Windows\CurrentVersion\Uninstall\{696F8871-C91D-4CB1-825D-36BE18065575}_is1"
set VALUE_NAME=InstallLocation

FOR /F "usebackq skip=2 tokens=1-2*" %%A IN (`REG QUERY %KEY_NAME_STEAM% /v %VALUE_NAME% `) DO (
    set ValueName=%%A
    set ValueValue=%%C
)

if defined ValueName (
    @echo %ValueValue%
)

FOR /F "usebackq skip=2 tokens=1-2*" %%A IN (`REG QUERY %KEY_NAME_RETAIL% /v %VALUE_NAME% `) DO (
    set ValueName=%%A
    set ValueValue=%%C
)
if defined ValueName (
    @echo %ValueValue%
)
