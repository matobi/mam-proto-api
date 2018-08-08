// Code generated by protoc-gen-go. DO NOT EDIT.
// source: hybrik.proto

package hybrik

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

type JobIn struct {
	JobId                string   `protobuf:"bytes,1,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JobIn) Reset()         { *m = JobIn{} }
func (m *JobIn) String() string { return proto.CompactTextString(m) }
func (*JobIn) ProtoMessage()    {}
func (*JobIn) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_8fee990f0d0ce65a, []int{0}
}
func (m *JobIn) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JobIn.Unmarshal(m, b)
}
func (m *JobIn) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JobIn.Marshal(b, m, deterministic)
}
func (dst *JobIn) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JobIn.Merge(dst, src)
}
func (m *JobIn) XXX_Size() int {
	return xxx_messageInfo_JobIn.Size(m)
}
func (m *JobIn) XXX_DiscardUnknown() {
	xxx_messageInfo_JobIn.DiscardUnknown(m)
}

var xxx_messageInfo_JobIn proto.InternalMessageInfo

func (m *JobIn) GetJobId() string {
	if m != nil {
		return m.JobId
	}
	return ""
}

type JobOut struct {
	Job                  *Job     `protobuf:"bytes,1,opt,name=job,proto3" json:"job,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JobOut) Reset()         { *m = JobOut{} }
func (m *JobOut) String() string { return proto.CompactTextString(m) }
func (*JobOut) ProtoMessage()    {}
func (*JobOut) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_8fee990f0d0ce65a, []int{1}
}
func (m *JobOut) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JobOut.Unmarshal(m, b)
}
func (m *JobOut) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JobOut.Marshal(b, m, deterministic)
}
func (dst *JobOut) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JobOut.Merge(dst, src)
}
func (m *JobOut) XXX_Size() int {
	return xxx_messageInfo_JobOut.Size(m)
}
func (m *JobOut) XXX_DiscardUnknown() {
	xxx_messageInfo_JobOut.DiscardUnknown(m)
}

var xxx_messageInfo_JobOut proto.InternalMessageInfo

func (m *JobOut) GetJob() *Job {
	if m != nil {
		return m.Job
	}
	return nil
}

type Job struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name                 string   `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Status               string   `protobuf:"bytes,3,opt,name=status,proto3" json:"status,omitempty"`
	Started              int64    `protobuf:"varint,4,opt,name=started,proto3" json:"started,omitempty"`
	Finished             int64    `protobuf:"varint,5,opt,name=finished,proto3" json:"finished,omitempty"`
	Progress             int32    `protobuf:"varint,6,opt,name=progress,proto3" json:"progress,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Job) Reset()         { *m = Job{} }
func (m *Job) String() string { return proto.CompactTextString(m) }
func (*Job) ProtoMessage()    {}
func (*Job) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_8fee990f0d0ce65a, []int{2}
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

func (m *Job) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Job) GetStatus() string {
	if m != nil {
		return m.Status
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

func (m *Job) GetProgress() int32 {
	if m != nil {
		return m.Progress
	}
	return 0
}

type CreateJobIn struct {
	Dir                  string   `protobuf:"bytes,1,opt,name=dir,proto3" json:"dir,omitempty"`
	File                 string   `protobuf:"bytes,2,opt,name=file,proto3" json:"file,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateJobIn) Reset()         { *m = CreateJobIn{} }
func (m *CreateJobIn) String() string { return proto.CompactTextString(m) }
func (*CreateJobIn) ProtoMessage()    {}
func (*CreateJobIn) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_8fee990f0d0ce65a, []int{3}
}
func (m *CreateJobIn) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateJobIn.Unmarshal(m, b)
}
func (m *CreateJobIn) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateJobIn.Marshal(b, m, deterministic)
}
func (dst *CreateJobIn) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateJobIn.Merge(dst, src)
}
func (m *CreateJobIn) XXX_Size() int {
	return xxx_messageInfo_CreateJobIn.Size(m)
}
func (m *CreateJobIn) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateJobIn.DiscardUnknown(m)
}

var xxx_messageInfo_CreateJobIn proto.InternalMessageInfo

func (m *CreateJobIn) GetDir() string {
	if m != nil {
		return m.Dir
	}
	return ""
}

func (m *CreateJobIn) GetFile() string {
	if m != nil {
		return m.File
	}
	return ""
}

type CreateJobOut struct {
	JobId                string   `protobuf:"bytes,1,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateJobOut) Reset()         { *m = CreateJobOut{} }
func (m *CreateJobOut) String() string { return proto.CompactTextString(m) }
func (*CreateJobOut) ProtoMessage()    {}
func (*CreateJobOut) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_8fee990f0d0ce65a, []int{4}
}
func (m *CreateJobOut) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateJobOut.Unmarshal(m, b)
}
func (m *CreateJobOut) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateJobOut.Marshal(b, m, deterministic)
}
func (dst *CreateJobOut) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateJobOut.Merge(dst, src)
}
func (m *CreateJobOut) XXX_Size() int {
	return xxx_messageInfo_CreateJobOut.Size(m)
}
func (m *CreateJobOut) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateJobOut.DiscardUnknown(m)
}

var xxx_messageInfo_CreateJobOut proto.InternalMessageInfo

func (m *CreateJobOut) GetJobId() string {
	if m != nil {
		return m.JobId
	}
	return ""
}

func init() {
	proto.RegisterType((*JobIn)(nil), "hybrik.JobIn")
	proto.RegisterType((*JobOut)(nil), "hybrik.JobOut")
	proto.RegisterType((*Job)(nil), "hybrik.Job")
	proto.RegisterType((*CreateJobIn)(nil), "hybrik.CreateJobIn")
	proto.RegisterType((*CreateJobOut)(nil), "hybrik.CreateJobOut")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// HybrikClient is the client API for Hybrik service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type HybrikClient interface {
	GetJob(ctx context.Context, in *JobIn, opts ...grpc.CallOption) (*JobOut, error)
	CreateJob(ctx context.Context, in *CreateJobIn, opts ...grpc.CallOption) (*CreateJobOut, error)
}

type hybrikClient struct {
	cc *grpc.ClientConn
}

func NewHybrikClient(cc *grpc.ClientConn) HybrikClient {
	return &hybrikClient{cc}
}

func (c *hybrikClient) GetJob(ctx context.Context, in *JobIn, opts ...grpc.CallOption) (*JobOut, error) {
	out := new(JobOut)
	err := c.cc.Invoke(ctx, "/hybrik.Hybrik/GetJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *hybrikClient) CreateJob(ctx context.Context, in *CreateJobIn, opts ...grpc.CallOption) (*CreateJobOut, error) {
	out := new(CreateJobOut)
	err := c.cc.Invoke(ctx, "/hybrik.Hybrik/CreateJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// HybrikServer is the server API for Hybrik service.
type HybrikServer interface {
	GetJob(context.Context, *JobIn) (*JobOut, error)
	CreateJob(context.Context, *CreateJobIn) (*CreateJobOut, error)
}

func RegisterHybrikServer(s *grpc.Server, srv HybrikServer) {
	s.RegisterService(&_Hybrik_serviceDesc, srv)
}

func _Hybrik_GetJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(JobIn)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(HybrikServer).GetJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hybrik.Hybrik/GetJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(HybrikServer).GetJob(ctx, req.(*JobIn))
	}
	return interceptor(ctx, in, info, handler)
}

func _Hybrik_CreateJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateJobIn)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(HybrikServer).CreateJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hybrik.Hybrik/CreateJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(HybrikServer).CreateJob(ctx, req.(*CreateJobIn))
	}
	return interceptor(ctx, in, info, handler)
}

var _Hybrik_serviceDesc = grpc.ServiceDesc{
	ServiceName: "hybrik.Hybrik",
	HandlerType: (*HybrikServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetJob",
			Handler:    _Hybrik_GetJob_Handler,
		},
		{
			MethodName: "CreateJob",
			Handler:    _Hybrik_CreateJob_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hybrik.proto",
}

func init() { proto.RegisterFile("hybrik.proto", fileDescriptor_hybrik_8fee990f0d0ce65a) }

var fileDescriptor_hybrik_8fee990f0d0ce65a = []byte{
	// 314 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x91, 0xbf, 0x4e, 0xc3, 0x30,
	0x10, 0xc6, 0x49, 0xd3, 0x18, 0x7a, 0x29, 0x15, 0x3a, 0xfe, 0xc8, 0x54, 0x02, 0x55, 0x91, 0x10,
	0x85, 0x21, 0x43, 0xbb, 0x30, 0x97, 0x01, 0x9a, 0xa5, 0x55, 0x5e, 0x00, 0xc5, 0xc4, 0xa5, 0x2e,
	0x24, 0xae, 0x6c, 0x77, 0xe0, 0x39, 0x78, 0x61, 0x64, 0x27, 0xb5, 0x2a, 0xc1, 0x76, 0xbf, 0xef,
	0xf3, 0x9d, 0xbe, 0x3b, 0x43, 0x7f, 0xfd, 0xcd, 0x94, 0xf8, 0x4c, 0xb7, 0x4a, 0x1a, 0x89, 0xa4,
	0xa1, 0xe4, 0x16, 0xa2, 0x4c, 0xb2, 0x79, 0x8d, 0x97, 0x40, 0x36, 0x92, 0xbd, 0x89, 0x92, 0x06,
	0xa3, 0x60, 0xdc, 0xcb, 0xa3, 0x8d, 0x64, 0xf3, 0x32, 0xb9, 0x07, 0x92, 0x49, 0xb6, 0xd8, 0x19,
	0xbc, 0x81, 0x70, 0x23, 0x99, 0x73, 0xe3, 0x49, 0x9c, 0xb6, 0xd3, 0x32, 0xc9, 0x72, 0xab, 0x27,
	0x3f, 0x01, 0x84, 0x99, 0x64, 0x38, 0x80, 0x8e, 0x9f, 0xd1, 0x11, 0x25, 0x22, 0x74, 0xeb, 0xa2,
	0xe2, 0xb4, 0xe3, 0x14, 0x57, 0xe3, 0x15, 0x10, 0x6d, 0x0a, 0xb3, 0xd3, 0x34, 0x74, 0x6a, 0x4b,
	0x48, 0xe1, 0x58, 0x9b, 0x42, 0x19, 0x5e, 0xd2, 0xee, 0x28, 0x18, 0x87, 0xf9, 0x1e, 0x71, 0x08,
	0x27, 0x2b, 0x51, 0x0b, 0xbd, 0xe6, 0x25, 0x8d, 0x9c, 0xe5, 0xd9, 0x7a, 0x5b, 0x25, 0x3f, 0x14,
	0xd7, 0x9a, 0x92, 0x51, 0x30, 0x8e, 0x72, 0xcf, 0xc9, 0x14, 0xe2, 0x67, 0xc5, 0x0b, 0xc3, 0x9b,
	0x25, 0xcf, 0x20, 0x2c, 0x85, 0x6a, 0xd3, 0xd9, 0xd2, 0xc6, 0x5b, 0x89, 0x2f, 0x1f, 0xcf, 0xd6,
	0xc9, 0x1d, 0xf4, 0x7d, 0x93, 0xdd, 0xfc, 0xff, 0xd3, 0x4c, 0x2a, 0x20, 0xaf, 0xee, 0x08, 0xf8,
	0x00, 0xe4, 0x85, 0x1b, 0xbb, 0xfd, 0xe9, 0xc1, 0x5d, 0xe6, 0xf5, 0x70, 0x70, 0x80, 0x8b, 0x9d,
	0x49, 0x8e, 0xf0, 0x09, 0x7a, 0x7e, 0x36, 0x9e, 0xef, 0xed, 0x83, 0x8c, 0xc3, 0x8b, 0x3f, 0xa2,
	0xeb, 0x9c, 0x3d, 0xc2, 0xf5, 0xbb, 0xac, 0xd2, 0x9a, 0xd7, 0x26, 0xad, 0x8a, 0xaa, 0xf9, 0xc7,
	0xf6, 0xed, 0x2c, 0x6e, 0x92, 0x2c, 0xad, 0xb6, 0x0c, 0x18, 0x71, 0xe6, 0xf4, 0x37, 0x00, 0x00,
	0xff, 0xff, 0x03, 0x31, 0x75, 0x29, 0xf4, 0x01, 0x00, 0x00,
}
