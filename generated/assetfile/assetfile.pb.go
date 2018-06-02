// Code generated by protoc-gen-go. DO NOT EDIT.
// source: assetfile.proto

package assetfile

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type AssetsRequest struct {
	HouseId              string   `protobuf:"bytes,1,opt,name=house_id,json=houseId" json:"house_id,omitempty"`
	AppName              string   `protobuf:"bytes,2,opt,name=app_name,json=appName" json:"app_name,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *AssetsRequest) Reset()         { *m = AssetsRequest{} }
func (m *AssetsRequest) String() string { return proto.CompactTextString(m) }
func (*AssetsRequest) ProtoMessage()    {}
func (*AssetsRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_assetfile_1a6006608b4438e9, []int{0}
}
func (m *AssetsRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AssetsRequest.Unmarshal(m, b)
}
func (m *AssetsRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AssetsRequest.Marshal(b, m, deterministic)
}
func (dst *AssetsRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AssetsRequest.Merge(dst, src)
}
func (m *AssetsRequest) XXX_Size() int {
	return xxx_messageInfo_AssetsRequest.Size(m)
}
func (m *AssetsRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_AssetsRequest.DiscardUnknown(m)
}

var xxx_messageInfo_AssetsRequest proto.InternalMessageInfo

func (m *AssetsRequest) GetHouseId() string {
	if m != nil {
		return m.HouseId
	}
	return ""
}

func (m *AssetsRequest) GetAppName() string {
	if m != nil {
		return m.AppName
	}
	return ""
}

type AssetsResponse struct {
	HouseId              string   `protobuf:"bytes,1,opt,name=house_id,json=houseId" json:"house_id,omitempty"`
	AppName              string   `protobuf:"bytes,2,opt,name=app_name,json=appName" json:"app_name,omitempty"`
	ModEpoch             int64    `protobuf:"varint,3,opt,name=mod_epoch,json=modEpoch" json:"mod_epoch,omitempty"`
	Files                []*File  `protobuf:"bytes,4,rep,name=files" json:"files,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *AssetsResponse) Reset()         { *m = AssetsResponse{} }
func (m *AssetsResponse) String() string { return proto.CompactTextString(m) }
func (*AssetsResponse) ProtoMessage()    {}
func (*AssetsResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_assetfile_1a6006608b4438e9, []int{1}
}
func (m *AssetsResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AssetsResponse.Unmarshal(m, b)
}
func (m *AssetsResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AssetsResponse.Marshal(b, m, deterministic)
}
func (dst *AssetsResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AssetsResponse.Merge(dst, src)
}
func (m *AssetsResponse) XXX_Size() int {
	return xxx_messageInfo_AssetsResponse.Size(m)
}
func (m *AssetsResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_AssetsResponse.DiscardUnknown(m)
}

var xxx_messageInfo_AssetsResponse proto.InternalMessageInfo

func (m *AssetsResponse) GetHouseId() string {
	if m != nil {
		return m.HouseId
	}
	return ""
}

func (m *AssetsResponse) GetAppName() string {
	if m != nil {
		return m.AppName
	}
	return ""
}

func (m *AssetsResponse) GetModEpoch() int64 {
	if m != nil {
		return m.ModEpoch
	}
	return 0
}

func (m *AssetsResponse) GetFiles() []*File {
	if m != nil {
		return m.Files
	}
	return nil
}

type File struct {
	Name  string `protobuf:"bytes,1,opt,name=name" json:"name,omitempty"`
	Path  string `protobuf:"bytes,2,opt,name=path" json:"path,omitempty"`
	Group string `protobuf:"bytes,3,opt,name=group" json:"group,omitempty"`
	// string content = 3;
	Md5                  string   `protobuf:"bytes,4,opt,name=md5" json:"md5,omitempty"`
	ModEpoch             int64    `protobuf:"varint,5,opt,name=mod_epoch,json=modEpoch" json:"mod_epoch,omitempty"`
	Size                 int64    `protobuf:"varint,6,opt,name=size" json:"size,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *File) Reset()         { *m = File{} }
func (m *File) String() string { return proto.CompactTextString(m) }
func (*File) ProtoMessage()    {}
func (*File) Descriptor() ([]byte, []int) {
	return fileDescriptor_assetfile_1a6006608b4438e9, []int{2}
}
func (m *File) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_File.Unmarshal(m, b)
}
func (m *File) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_File.Marshal(b, m, deterministic)
}
func (dst *File) XXX_Merge(src proto.Message) {
	xxx_messageInfo_File.Merge(dst, src)
}
func (m *File) XXX_Size() int {
	return xxx_messageInfo_File.Size(m)
}
func (m *File) XXX_DiscardUnknown() {
	xxx_messageInfo_File.DiscardUnknown(m)
}

var xxx_messageInfo_File proto.InternalMessageInfo

func (m *File) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *File) GetPath() string {
	if m != nil {
		return m.Path
	}
	return ""
}

func (m *File) GetGroup() string {
	if m != nil {
		return m.Group
	}
	return ""
}

func (m *File) GetMd5() string {
	if m != nil {
		return m.Md5
	}
	return ""
}

func (m *File) GetModEpoch() int64 {
	if m != nil {
		return m.ModEpoch
	}
	return 0
}

func (m *File) GetSize() int64 {
	if m != nil {
		return m.Size
	}
	return 0
}

func init() {
	proto.RegisterType((*AssetsRequest)(nil), "assetfile.AssetsRequest")
	proto.RegisterType((*AssetsResponse)(nil), "assetfile.AssetsResponse")
	proto.RegisterType((*File)(nil), "assetfile.File")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// AssetFileClient is the client API for AssetFile service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type AssetFileClient interface {
	GetAssets(ctx context.Context, in *AssetsRequest, opts ...grpc.CallOption) (*AssetsResponse, error)
}

type assetFileClient struct {
	cc *grpc.ClientConn
}

func NewAssetFileClient(cc *grpc.ClientConn) AssetFileClient {
	return &assetFileClient{cc}
}

func (c *assetFileClient) GetAssets(ctx context.Context, in *AssetsRequest, opts ...grpc.CallOption) (*AssetsResponse, error) {
	out := new(AssetsResponse)
	err := c.cc.Invoke(ctx, "/assetfile.AssetFile/GetAssets", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AssetFileServer is the server API for AssetFile service.
type AssetFileServer interface {
	GetAssets(context.Context, *AssetsRequest) (*AssetsResponse, error)
}

func RegisterAssetFileServer(s *grpc.Server, srv AssetFileServer) {
	s.RegisterService(&_AssetFile_serviceDesc, srv)
}

func _AssetFile_GetAssets_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AssetsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AssetFileServer).GetAssets(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/assetfile.AssetFile/GetAssets",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AssetFileServer).GetAssets(ctx, req.(*AssetsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _AssetFile_serviceDesc = grpc.ServiceDesc{
	ServiceName: "assetfile.AssetFile",
	HandlerType: (*AssetFileServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetAssets",
			Handler:    _AssetFile_GetAssets_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "assetfile.proto",
}

func init() { proto.RegisterFile("assetfile.proto", fileDescriptor_assetfile_1a6006608b4438e9) }

var fileDescriptor_assetfile_1a6006608b4438e9 = []byte{
	// 297 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x51, 0xdf, 0x4a, 0xfb, 0x30,
	0x14, 0xfe, 0xe5, 0xd7, 0x76, 0x2e, 0x47, 0xdc, 0x24, 0x78, 0x91, 0xb9, 0x9b, 0x52, 0x10, 0x7a,
	0x55, 0x61, 0xe2, 0x03, 0x58, 0x98, 0xe2, 0x8d, 0x8e, 0xbe, 0x40, 0x89, 0xeb, 0x71, 0x2d, 0x2c,
	0x4b, 0x5c, 0xd2, 0x1b, 0x5f, 0x40, 0xf0, 0xa9, 0x25, 0x89, 0x6e, 0x4e, 0xbc, 0xf2, 0xee, 0xfb,
	0x13, 0xce, 0xf7, 0xe5, 0x1c, 0x18, 0x0b, 0x63, 0xd0, 0x3e, 0x77, 0x6b, 0x2c, 0xf4, 0x56, 0x59,
	0xc5, 0xe8, 0x4e, 0xc8, 0xe6, 0x70, 0x72, 0xe3, 0x88, 0xa9, 0xf0, 0xa5, 0x47, 0x63, 0xd9, 0x04,
	0x86, 0xad, 0xea, 0x0d, 0xd6, 0x5d, 0xc3, 0x49, 0x4a, 0x72, 0x5a, 0x1d, 0x79, 0x7e, 0xdf, 0x38,
	0x4b, 0x68, 0x5d, 0x6f, 0x84, 0x44, 0xfe, 0x3f, 0x58, 0x42, 0xeb, 0x07, 0x21, 0x31, 0x7b, 0x27,
	0x30, 0xfa, 0x9a, 0x63, 0xb4, 0xda, 0x18, 0xfc, 0xdb, 0x20, 0x36, 0x05, 0x2a, 0x55, 0x53, 0xa3,
	0x56, 0xcb, 0x96, 0x47, 0x29, 0xc9, 0xa3, 0x6a, 0x28, 0x55, 0x33, 0x77, 0x9c, 0x5d, 0x40, 0xe2,
	0x4a, 0x1b, 0x1e, 0xa7, 0x51, 0x7e, 0x3c, 0x1b, 0x17, 0xfb, 0x8f, 0xdd, 0x76, 0x6b, 0xac, 0x82,
	0x9b, 0xbd, 0x11, 0x88, 0x1d, 0x67, 0x0c, 0x62, 0x9f, 0x11, 0xe2, 0x3d, 0x76, 0x9a, 0x16, 0xb6,
	0xfd, 0xcc, 0xf5, 0x98, 0x9d, 0x41, 0xb2, 0xda, 0xaa, 0x5e, 0xfb, 0x40, 0x5a, 0x05, 0xc2, 0x4e,
	0x21, 0x92, 0xcd, 0x35, 0x8f, 0xbd, 0xe6, 0xe0, 0x61, 0xb9, 0xe4, 0x47, 0x39, 0x06, 0xb1, 0xe9,
	0x5e, 0x91, 0x0f, 0xbc, 0xee, 0xf1, 0xec, 0x11, 0xa8, 0xdf, 0x8a, 0x6f, 0x53, 0x02, 0xbd, 0x43,
	0x1b, 0xb6, 0xc4, 0xf8, 0xb7, 0xee, 0x07, 0x07, 0x38, 0x9f, 0xfc, 0xe2, 0x84, 0x95, 0x66, 0xff,
	0xca, 0x4b, 0x98, 0x2e, 0x95, 0x2c, 0xa4, 0x5d, 0x15, 0x52, 0xc8, 0x70, 0xce, 0xfd, 0xfb, 0x72,
	0xb4, 0x4b, 0x5b, 0x38, 0x67, 0x41, 0x9e, 0x06, 0xfe, 0xc9, 0xd5, 0x47, 0x00, 0x00, 0x00, 0xff,
	0xff, 0xad, 0x7e, 0xf8, 0x6d, 0x04, 0x02, 0x00, 0x00,
}