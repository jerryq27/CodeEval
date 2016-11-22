while read line || [[ -n "$line" ]]; do
    printf '%d\n' "0x$line"
done < $1