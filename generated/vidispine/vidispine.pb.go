// Code generated by protoc-gen-go. DO NOT EDIT.
// source: vidispine.proto

package vidispine

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

type ItemRequest struct {
	ItemId               string   `protobuf:"bytes,1,opt,name=item_id,json=itemId,proto3" json:"item_id,omitempty"`
	ShapeTag             string   `protobuf:"bytes,2,opt,name=shape_tag,json=shapeTag,proto3" json:"shape_tag,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ItemRequest) Reset()         { *m = ItemRequest{} }
func (m *ItemRequest) String() string { return proto.CompactTextString(m) }
func (*ItemRequest) ProtoMessage()    {}
func (*ItemRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{0}
}
func (m *ItemRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ItemRequest.Unmarshal(m, b)
}
func (m *ItemRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ItemRequest.Marshal(b, m, deterministic)
}
func (dst *ItemRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ItemRequest.Merge(dst, src)
}
func (m *ItemRequest) XXX_Size() int {
	return xxx_messageInfo_ItemRequest.Size(m)
}
func (m *ItemRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ItemRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ItemRequest proto.InternalMessageInfo

func (m *ItemRequest) GetItemId() string {
	if m != nil {
		return m.ItemId
	}
	return ""
}

func (m *ItemRequest) GetShapeTag() string {
	if m != nil {
		return m.ShapeTag
	}
	return ""
}

type ItemResponse struct {
	Item                 *Item    `protobuf:"bytes,1,opt,name=item,proto3" json:"item,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ItemResponse) Reset()         { *m = ItemResponse{} }
func (m *ItemResponse) String() string { return proto.CompactTextString(m) }
func (*ItemResponse) ProtoMessage()    {}
func (*ItemResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{1}
}
func (m *ItemResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ItemResponse.Unmarshal(m, b)
}
func (m *ItemResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ItemResponse.Marshal(b, m, deterministic)
}
func (dst *ItemResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ItemResponse.Merge(dst, src)
}
func (m *ItemResponse) XXX_Size() int {
	return xxx_messageInfo_ItemResponse.Size(m)
}
func (m *ItemResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ItemResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ItemResponse proto.InternalMessageInfo

func (m *ItemResponse) GetItem() *Item {
	if m != nil {
		return m.Item
	}
	return nil
}

type Item struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Shapes               []*Shape `protobuf:"bytes,2,rep,name=shapes,proto3" json:"shapes,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Item) Reset()         { *m = Item{} }
func (m *Item) String() string { return proto.CompactTextString(m) }
func (*Item) ProtoMessage()    {}
func (*Item) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{2}
}
func (m *Item) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Item.Unmarshal(m, b)
}
func (m *Item) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Item.Marshal(b, m, deterministic)
}
func (dst *Item) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Item.Merge(dst, src)
}
func (m *Item) XXX_Size() int {
	return xxx_messageInfo_Item.Size(m)
}
func (m *Item) XXX_DiscardUnknown() {
	xxx_messageInfo_Item.DiscardUnknown(m)
}

var xxx_messageInfo_Item proto.InternalMessageInfo

func (m *Item) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Item) GetShapes() []*Shape {
	if m != nil {
		return m.Shapes
	}
	return nil
}

type Shape struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Version              int32    `protobuf:"varint,2,opt,name=version,proto3" json:"version,omitempty"`
	Title                string   `protobuf:"bytes,3,opt,name=title,proto3" json:"title,omitempty"`
	OrgFilename          string   `protobuf:"bytes,4,opt,name=orgFilename,proto3" json:"orgFilename,omitempty"`
	Tags                 []string `protobuf:"bytes,5,rep,name=tags,proto3" json:"tags,omitempty"`
	Videos               []*Video `protobuf:"bytes,6,rep,name=videos,proto3" json:"videos,omitempty"`
	Audios               []*Audio `protobuf:"bytes,7,rep,name=audios,proto3" json:"audios,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Shape) Reset()         { *m = Shape{} }
func (m *Shape) String() string { return proto.CompactTextString(m) }
func (*Shape) ProtoMessage()    {}
func (*Shape) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{3}
}
func (m *Shape) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Shape.Unmarshal(m, b)
}
func (m *Shape) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Shape.Marshal(b, m, deterministic)
}
func (dst *Shape) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Shape.Merge(dst, src)
}
func (m *Shape) XXX_Size() int {
	return xxx_messageInfo_Shape.Size(m)
}
func (m *Shape) XXX_DiscardUnknown() {
	xxx_messageInfo_Shape.DiscardUnknown(m)
}

var xxx_messageInfo_Shape proto.InternalMessageInfo

func (m *Shape) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Shape) GetVersion() int32 {
	if m != nil {
		return m.Version
	}
	return 0
}

func (m *Shape) GetTitle() string {
	if m != nil {
		return m.Title
	}
	return ""
}

func (m *Shape) GetOrgFilename() string {
	if m != nil {
		return m.OrgFilename
	}
	return ""
}

func (m *Shape) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *Shape) GetVideos() []*Video {
	if m != nil {
		return m.Videos
	}
	return nil
}

func (m *Shape) GetAudios() []*Audio {
	if m != nil {
		return m.Audios
	}
	return nil
}

type Audio struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Language             string   `protobuf:"bytes,2,opt,name=language,proto3" json:"language,omitempty"`
	ChannelCount         int32    `protobuf:"varint,3,opt,name=channelCount,proto3" json:"channelCount,omitempty"`
	ChannelLayout        string   `protobuf:"bytes,4,opt,name=channelLayout,proto3" json:"channelLayout,omitempty"`
	Files                []*File  `protobuf:"bytes,5,rep,name=files,proto3" json:"files,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Audio) Reset()         { *m = Audio{} }
func (m *Audio) String() string { return proto.CompactTextString(m) }
func (*Audio) ProtoMessage()    {}
func (*Audio) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{4}
}
func (m *Audio) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Audio.Unmarshal(m, b)
}
func (m *Audio) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Audio.Marshal(b, m, deterministic)
}
func (dst *Audio) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Audio.Merge(dst, src)
}
func (m *Audio) XXX_Size() int {
	return xxx_messageInfo_Audio.Size(m)
}
func (m *Audio) XXX_DiscardUnknown() {
	xxx_messageInfo_Audio.DiscardUnknown(m)
}

var xxx_messageInfo_Audio proto.InternalMessageInfo

func (m *Audio) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Audio) GetLanguage() string {
	if m != nil {
		return m.Language
	}
	return ""
}

func (m *Audio) GetChannelCount() int32 {
	if m != nil {
		return m.ChannelCount
	}
	return 0
}

func (m *Audio) GetChannelLayout() string {
	if m != nil {
		return m.ChannelLayout
	}
	return ""
}

func (m *Audio) GetFiles() []*File {
	if m != nil {
		return m.Files
	}
	return nil
}

type Video struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Files                []*File  `protobuf:"bytes,2,rep,name=files,proto3" json:"files,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Video) Reset()         { *m = Video{} }
func (m *Video) String() string { return proto.CompactTextString(m) }
func (*Video) ProtoMessage()    {}
func (*Video) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{5}
}
func (m *Video) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Video.Unmarshal(m, b)
}
func (m *Video) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Video.Marshal(b, m, deterministic)
}
func (dst *Video) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Video.Merge(dst, src)
}
func (m *Video) XXX_Size() int {
	return xxx_messageInfo_Video.Size(m)
}
func (m *Video) XXX_DiscardUnknown() {
	xxx_messageInfo_Video.DiscardUnknown(m)
}

var xxx_messageInfo_Video proto.InternalMessageInfo

func (m *Video) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Video) GetFiles() []*File {
	if m != nil {
		return m.Files
	}
	return nil
}

type File struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	StorageID            string   `protobuf:"bytes,2,opt,name=storageID,proto3" json:"storageID,omitempty"`
	OrgFilename          string   `protobuf:"bytes,3,opt,name=orgFilename,proto3" json:"orgFilename,omitempty"`
	Size                 int64    `protobuf:"varint,4,opt,name=size,proto3" json:"size,omitempty"`
	Hash                 string   `protobuf:"bytes,5,opt,name=hash,proto3" json:"hash,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *File) Reset()         { *m = File{} }
func (m *File) String() string { return proto.CompactTextString(m) }
func (*File) ProtoMessage()    {}
func (*File) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{6}
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

func (m *File) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *File) GetStorageID() string {
	if m != nil {
		return m.StorageID
	}
	return ""
}

func (m *File) GetOrgFilename() string {
	if m != nil {
		return m.OrgFilename
	}
	return ""
}

func (m *File) GetSize() int64 {
	if m != nil {
		return m.Size
	}
	return 0
}

func (m *File) GetHash() string {
	if m != nil {
		return m.Hash
	}
	return ""
}

type JobRequest struct {
	JobId                string   `protobuf:"bytes,1,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JobRequest) Reset()         { *m = JobRequest{} }
func (m *JobRequest) String() string { return proto.CompactTextString(m) }
func (*JobRequest) ProtoMessage()    {}
func (*JobRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{7}
}
func (m *JobRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JobRequest.Unmarshal(m, b)
}
func (m *JobRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JobRequest.Marshal(b, m, deterministic)
}
func (dst *JobRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JobRequest.Merge(dst, src)
}
func (m *JobRequest) XXX_Size() int {
	return xxx_messageInfo_JobRequest.Size(m)
}
func (m *JobRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_JobRequest.DiscardUnknown(m)
}

var xxx_messageInfo_JobRequest proto.InternalMessageInfo

func (m *JobRequest) GetJobId() string {
	if m != nil {
		return m.JobId
	}
	return ""
}

type JobResponse struct {
	Job                  *Job     `protobuf:"bytes,1,opt,name=job,proto3" json:"job,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JobResponse) Reset()         { *m = JobResponse{} }
func (m *JobResponse) String() string { return proto.CompactTextString(m) }
func (*JobResponse) ProtoMessage()    {}
func (*JobResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{8}
}
func (m *JobResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JobResponse.Unmarshal(m, b)
}
func (m *JobResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JobResponse.Marshal(b, m, deterministic)
}
func (dst *JobResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JobResponse.Merge(dst, src)
}
func (m *JobResponse) XXX_Size() int {
	return xxx_messageInfo_JobResponse.Size(m)
}
func (m *JobResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_JobResponse.DiscardUnknown(m)
}

var xxx_messageInfo_JobResponse proto.InternalMessageInfo

func (m *JobResponse) GetJob() *Job {
	if m != nil {
		return m.Job
	}
	return nil
}

type Job struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	User                 string   `protobuf:"bytes,2,opt,name=user,proto3" json:"user,omitempty"`
	Status               string   `protobuf:"bytes,3,opt,name=status,proto3" json:"status,omitempty"`
	Type                 string   `protobuf:"bytes,4,opt,name=type,proto3" json:"type,omitempty"`
	Prio                 string   `protobuf:"bytes,5,opt,name=prio,proto3" json:"prio,omitempty"`
	Started              int64    `protobuf:"varint,6,opt,name=started,proto3" json:"started,omitempty"`
	Finished             int64    `protobuf:"varint,7,opt,name=finished,proto3" json:"finished,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Job) Reset()         { *m = Job{} }
func (m *Job) String() string { return proto.CompactTextString(m) }
func (*Job) ProtoMessage()    {}
func (*Job) Descriptor() ([]byte, []int) {
	return fileDescriptor_vidispine_dc88ca0009710f99, []int{9}
}
func (m *Job) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Job.Unmarshal(m, b)
}
func (m *Job) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Job.Marshal(b, m, deterministic)
}
func (dst *Job) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Job.Merge(dst, src)
}
func (m *Job) XXX_Size() int {
	return xxx_messageInfo_Job.Size(m)
}
func (m *Job) XXX_DiscardUnknown() {
	xxx_messageInfo_Job.DiscardUnknown(m)
}

var xxx_messageInfo_Job proto.InternalMessageInfo

func (m *Job) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Job) GetUser() string {
	if m != nil {
		return m.User
	}
	return ""
}

func (m *Job) GetStatus() string {
	if m != nil {
		return m.Status
	}
	return ""
}

func (m *Job) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

func (m *Job) GetPrio() string {
	if m != nil {
		return m.Prio
	}
	return ""
}

func (m *Job) GetStarted() int64 {
	if m != nil {
		return m.Started
	}
	return 0
}

func (m *Job) GetFinished() int64 {
	if m != nil {
		return m.Finished
	}
	return 0
}

func init() {
	proto.RegisterType((*ItemRequest)(nil), "vidispine.ItemRequest")
	proto.RegisterType((*ItemResponse)(nil), "vidispine.ItemResponse")
	proto.RegisterType((*Item)(nil), "vidispine.Item")
	proto.RegisterType((*Shape)(nil), "vidispine.Shape")
	proto.RegisterType((*Audio)(nil), "vidispine.Audio")
	proto.RegisterType((*Video)(nil), "vidispine.Video")
	proto.RegisterType((*File)(nil), "vidispine.File")
	proto.RegisterType((*JobRequest)(nil), "vidispine.JobRequest")
	proto.RegisterType((*JobResponse)(nil), "vidispine.JobResponse")
	proto.RegisterType((*Job)(nil), "vidispine.Job")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// VidispineClient is the client API for Vidispine service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type VidispineClient interface {
	GetJob(ctx context.Context, in *JobRequest, opts ...grpc.CallOption) (*JobResponse, error)
	GetItem(ctx context.Context, in *ItemRequest, opts ...grpc.CallOption) (*ItemResponse, error)
}

type vidispineClient struct {
	cc *grpc.ClientConn
}

func NewVidispineClient(cc *grpc.ClientConn) VidispineClient {
	return &vidispineClient{cc}
}

func (c *vidispineClient) GetJob(ctx context.Context, in *JobRequest, opts ...grpc.CallOption) (*JobResponse, error) {
	out := new(JobResponse)
	err := c.cc.Invoke(ctx, "/vidispine.Vidispine/GetJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *vidispineClient) GetItem(ctx context.Context, in *ItemRequest, opts ...grpc.CallOption) (*ItemResponse, error) {
	out := new(ItemResponse)
	err := c.cc.Invoke(ctx, "/vidispine.Vidispine/GetItem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// VidispineServer is the server API for Vidispine service.
type VidispineServer interface {
	GetJob(context.Context, *JobRequest) (*JobResponse, error)
	GetItem(context.Context, *ItemRequest) (*ItemResponse, error)
}

func RegisterVidispineServer(s *grpc.Server, srv VidispineServer) {
	s.RegisterService(&_Vidispine_serviceDesc, srv)
}

func _Vidispine_GetJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(JobRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VidispineServer).GetJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/vidispine.Vidispine/GetJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VidispineServer).GetJob(ctx, req.(*JobRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Vidispine_GetItem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ItemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VidispineServer).GetItem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/vidispine.Vidispine/GetItem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VidispineServer).GetItem(ctx, req.(*ItemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Vidispine_serviceDesc = grpc.ServiceDesc{
	ServiceName: "vidispine.Vidispine",
	HandlerType: (*VidispineServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetJob",
			Handler:    _Vidispine_GetJob_Handler,
		},
		{
			MethodName: "GetItem",
			Handler:    _Vidispine_GetItem_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "vidispine.proto",
}

func init() { proto.RegisterFile("vidispine.proto", fileDescriptor_vidispine_dc88ca0009710f99) }

var fileDescriptor_vidispine_dc88ca0009710f99 = []byte{
	// 586 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x54, 0x4f, 0x6f, 0xd4, 0x3e,
	0x10, 0xfd, 0x65, 0xf3, 0x67, 0x9b, 0xd9, 0xfe, 0x5a, 0x64, 0xd1, 0xd6, 0x2a, 0x3d, 0xac, 0x52,
	0x90, 0xf6, 0xb4, 0xa0, 0xf6, 0x84, 0x84, 0x10, 0xb4, 0x88, 0x6a, 0x2b, 0x0e, 0x55, 0x40, 0xbd,
	0x56, 0x4e, 0xe3, 0x66, 0xbd, 0xda, 0xc4, 0x21, 0x76, 0x56, 0x2a, 0x07, 0x4e, 0x7c, 0x0f, 0x2e,
	0x7c, 0x21, 0xbe, 0x11, 0xf2, 0xc4, 0xd9, 0x7f, 0x41, 0xdc, 0xe6, 0xbd, 0x37, 0xe3, 0xcc, 0xf3,
	0x8c, 0x03, 0xfb, 0x0b, 0x91, 0x0a, 0x55, 0x8a, 0x82, 0x8f, 0xcb, 0x4a, 0x6a, 0x49, 0xc2, 0x25,
	0x11, 0x5d, 0xc2, 0x60, 0xa2, 0x79, 0x1e, 0xf3, 0xaf, 0x35, 0x57, 0x9a, 0x1c, 0x41, 0x5f, 0x68,
	0x9e, 0xdf, 0x89, 0x94, 0x3a, 0x43, 0x67, 0x14, 0xc6, 0x81, 0x81, 0x93, 0x94, 0x3c, 0x83, 0x50,
	0x4d, 0x59, 0xc9, 0xef, 0x34, 0xcb, 0x68, 0x0f, 0xa5, 0x1d, 0x24, 0xbe, 0xb0, 0x2c, 0x3a, 0x87,
	0xdd, 0xe6, 0x10, 0x55, 0xca, 0x42, 0x71, 0x72, 0x0a, 0x9e, 0x29, 0xc3, 0x23, 0x06, 0x67, 0xfb,
	0xe3, 0xd5, 0xf7, 0x31, 0x0d, 0xc5, 0xe8, 0x1d, 0x78, 0x06, 0x91, 0x3d, 0xe8, 0x2d, 0xbf, 0xd6,
	0x13, 0x29, 0x19, 0x41, 0x80, 0x07, 0x2b, 0xda, 0x1b, 0xba, 0xa3, 0xc1, 0xd9, 0x93, 0xb5, 0xf2,
	0xcf, 0x46, 0x88, 0xad, 0x1e, 0xfd, 0x76, 0xc0, 0x47, 0xa6, 0x73, 0x06, 0x85, 0xfe, 0x82, 0x57,
	0x4a, 0xc8, 0x02, 0x7b, 0xf5, 0xe3, 0x16, 0x92, 0xa7, 0xe0, 0x6b, 0xa1, 0xe7, 0x9c, 0xba, 0x98,
	0xdc, 0x00, 0x32, 0x84, 0x81, 0xac, 0xb2, 0x8f, 0x62, 0xce, 0x0b, 0x96, 0x73, 0xea, 0xa1, 0xb6,
	0x4e, 0x11, 0x02, 0x9e, 0x66, 0x99, 0xa2, 0xfe, 0xd0, 0x1d, 0x85, 0x31, 0xc6, 0xa6, 0xd3, 0x85,
	0x48, 0xb9, 0x54, 0x34, 0xe8, 0x74, 0x7a, 0x6b, 0x84, 0xd8, 0xea, 0x26, 0x93, 0xd5, 0xa9, 0x90,
	0x8a, 0xf6, 0x3b, 0x99, 0xef, 0x8d, 0x10, 0x5b, 0x3d, 0xfa, 0xe5, 0x80, 0x8f, 0x4c, 0xc7, 0xd3,
	0x31, 0xec, 0xcc, 0x59, 0x91, 0xd5, 0x2c, 0xe3, 0xed, 0x00, 0x5a, 0x4c, 0x22, 0xd8, 0xbd, 0x9f,
	0xb2, 0xa2, 0xe0, 0xf3, 0x4b, 0x59, 0x17, 0x1a, 0xcd, 0xf9, 0xf1, 0x06, 0x47, 0x9e, 0xc3, 0xff,
	0x16, 0x7f, 0x62, 0x8f, 0xb2, 0xd6, 0xd6, 0xe5, 0x26, 0x49, 0x5e, 0x80, 0xff, 0x20, 0xe6, 0xbc,
	0x31, 0xba, 0x39, 0x3b, 0x73, 0x17, 0x71, 0xa3, 0x46, 0x6f, 0xc1, 0x47, 0x87, 0x9d, 0x2e, 0x97,
	0xf5, 0xbd, 0x7f, 0xd6, 0x7f, 0x07, 0xcf, 0xc0, 0x4e, 0xf9, 0x09, 0x84, 0x4a, 0xcb, 0x8a, 0x65,
	0x7c, 0xf2, 0xc1, 0xba, 0x5c, 0x11, 0xdb, 0x63, 0x72, 0xff, 0x3a, 0x26, 0x25, 0xbe, 0x35, 0x13,
	0x74, 0x63, 0x8c, 0x0d, 0x37, 0x65, 0x6a, 0x4a, 0x7d, 0x4c, 0xc7, 0x38, 0x3a, 0x05, 0xb8, 0x96,
	0x49, 0xbb, 0xf5, 0x07, 0x10, 0xcc, 0x64, 0xb2, 0x5a, 0x7a, 0x7f, 0x26, 0x93, 0x49, 0x1a, 0xbd,
	0x84, 0x01, 0x26, 0xd9, 0xad, 0x1e, 0x82, 0x3b, 0x93, 0x89, 0x5d, 0xea, 0xbd, 0x35, 0x63, 0x26,
	0xc9, 0x48, 0xd1, 0x4f, 0x07, 0xdc, 0x6b, 0x99, 0x74, 0x5c, 0x11, 0xf0, 0x6a, 0xc5, 0x2b, 0x6b,
	0x08, 0x63, 0x72, 0x08, 0x81, 0xd2, 0x4c, 0xd7, 0xca, 0xda, 0xb0, 0x08, 0x17, 0xed, 0xb1, 0x6c,
	0x77, 0x10, 0x63, 0xc3, 0x95, 0x95, 0x90, 0xad, 0x03, 0x13, 0x9b, 0x15, 0x57, 0x9a, 0x55, 0x9a,
	0xa7, 0x34, 0x40, 0xb3, 0x2d, 0x34, 0x8b, 0xf2, 0x20, 0x0a, 0xa1, 0xa6, 0x3c, 0xa5, 0x7d, 0x94,
	0x96, 0xf8, 0xec, 0x87, 0x03, 0xe1, 0x6d, 0xdb, 0x38, 0x79, 0x0d, 0xc1, 0x15, 0xd7, 0xa6, 0xe3,
	0x83, 0x2d, 0x3b, 0xcd, 0xc5, 0x1c, 0x1f, 0x6e, 0xd3, 0xcd, 0x55, 0x44, 0xff, 0x91, 0x37, 0xd0,
	0xbf, 0xe2, 0x1a, 0x1f, 0xf0, 0xe1, 0xf6, 0xfb, 0xb6, 0xc5, 0x47, 0x1d, 0xbe, 0xad, 0xbe, 0x78,
	0x05, 0x27, 0xf7, 0x32, 0x1f, 0x17, 0xbc, 0xd0, 0xe3, 0x9c, 0xe5, 0xcd, 0x6f, 0x69, 0x95, 0x7e,
	0xb1, 0xb7, 0xec, 0xf1, 0xc6, 0x28, 0x37, 0x4e, 0x12, 0x60, 0xca, 0xf9, 0x9f, 0x00, 0x00, 0x00,
	0xff, 0xff, 0xfb, 0x25, 0x60, 0xae, 0xcc, 0x04, 0x00, 0x00,
}
