#!/bin/bash
`javac PingHost.java`
echo "Pinger 1.2 C0d3d by dibyendu"
fname=$1
while read -r ip
do
	java PingHost $ip
done < "$fname"
