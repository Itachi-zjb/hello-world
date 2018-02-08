@echo off

echo hi
echo
::¹þ¹þ¹þ

::cls
title test
ver
date/t
time/t

set year=%date:~0,4%
echo %year%
set month=%date:~5,2%
echo %month%
set day=%date:~8,2%
echo %day%
set date_=%year%%month%%day%
echo %date_%

set folder_pre=d:\desktop\test_
set folder_path=%folder_pre%%date_%
echo %folder_path%
pause

if not exist %folder_path% (
	mkdir %folder_path%
	echo mk %folder_path% successfully!
) else (
	echo %folder_path% already exist!
)

goto end


:end
echo finish!
pause



