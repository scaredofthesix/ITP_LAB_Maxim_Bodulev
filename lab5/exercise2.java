#include <stdio.h>

struct b{
    unsigned version:4;
    unsigned ihl:4;
    unsigned dscp:6;
    unsigned ecn:2;
    unsigned total_length:16;
};

union a{
    int value;
    struct b fields;
};


int main(){
    union a ipv4header;
    ipv4header.fields.version = 4;
    ipv4header.fields.ihl= 5;
    ipv4header.fields.dscp=0;
    ipv4header.fields.ecn=0;
    ipv4header.fields.total_length=60;

    printf("version:%u\n",ipv4header.fields.version);
    printf("version:%u\n",ipv4header.fields.ihl);
    printf("version:%u\n",ipv4header.fields.dscp);
    printf("version:%u\n",ipv4header.fields.ecn);
    printf("version:%u\n",ipv4header.fields.total_length);
    return 0;
}
