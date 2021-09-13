#import "RCTBase64.h"

@implementation RCTBase64

RCT_EXPORT_MODULE()

RCT_EXPORT_BLOCKING_SYNCHRONOUS_METHOD(decode:(NSString * __nonnull)str)
{
    NSData *decodedData = [[NSData alloc] initWithBase64EncodedString:str options:0];
    NSString *decodedString = [[NSString alloc] initWithData:decodedData encoding:NSUTF8StringEncoding];
    return(decodedString);
}

RCT_EXPORT_BLOCKING_SYNCHRONOUS_METHOD(encode:(NSString * __nonnull)str)
{
    NSData *encodeData = [str dataUsingEncoding:NSUTF8StringEncoding];
    NSString *base64String = [encodeData base64EncodedStringWithOptions:0];
    return(base64String);
}

@end
