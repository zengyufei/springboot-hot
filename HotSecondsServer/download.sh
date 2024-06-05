DIR_BASE=$(cd "$(dirname $0)"; pwd)
cd $DIR_BASE/lib

version_number=$1
echo "version_number:$version_number"

if [[ $version_number -gt 181 || $version_number -eq 181 ]]; then
  echo "skip..."
elif [[ $version_number -eq 172 ]]; then
  if [ -f $DIR_BASE/lib/libjvm172.so ]; then
    rm -rf $DIR_BASE/lib/libjvm172.so
  fi
	curl -JLO https://github.com/thanple/HotSecondsIDEA/releases/download/libjvm_so/libjvm172.so
elif [[ $version_number -eq 152 ]]; then
    if [ -f $DIR_BASE/lib/libjvm152.so ]; then
      rm -rf $DIR_BASE/lib/libjvm152.so
    fi
    curl -JLO https://github.com/thanple/HotSecondsIDEA/releases/download/libjvm_so/libjvm152.so
elif [[ $version_number -eq 144 ]]; then
    if [ -f $DIR_BASE/lib/libjvm144.so ]; then
      rm -rf $DIR_BASE/lib/libjvm144.so
    fi
   curl -JLO https://github.com/thanple/HotSecondsIDEA/releases/download/libjvm_so/libjvm144.so
elif [[ $version_number -eq 112 ]]; then
    if [ -f $DIR_BASE/lib/libjvm112.so ]; then
      rm -rf $DIR_BASE/lib/libjvm112.so
    fi
   curl -JLO https://github.com/thanple/HotSecondsIDEA/releases/download/libjvm_so/libjvm112.so
elif [[ $version_number -eq 92 ]]; then
    if [ -f $DIR_BASE/lib/libjvm92.so ]; then
      rm -rf $DIR_BASE/lib/libjvm92.so
    fi
    curl -JLO https://github.com/thanple/HotSecondsIDEA/releases/download/libjvm_so/libjvm92.so
elif [[ $version_number -eq 74 ]]; then
    if [ -f $DIR_BASE/lib/libjvm74.so ]; then
      rm -rf $DIR_BASE/lib/libjvm74.so
    fi
    curl -JLO https://github.com/thanple/HotSecondsIDEA/releases/download/libjvm_so/libjvm74.so
else
   echo "skip..."
fi

echo "done!"